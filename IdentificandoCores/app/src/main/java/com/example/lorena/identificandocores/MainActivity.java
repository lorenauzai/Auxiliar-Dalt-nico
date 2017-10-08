package com.example.lorena.identificandocores;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView txtCor;
    private TextView txtSoCor;
    private Bitmap bitmap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.imageView);
        txtCor = (TextView) findViewById(R.id.txtEvento);
        imageView = (ImageView) findViewById(R.id.imageView);
        txtSoCor = (TextView) findViewById(R.id.textView);

        imageView.setDrawingCacheEnabled(true);
        imageView.buildDrawingCache(true);

        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN ||
                        motionEvent.getAction() == MotionEvent.ACTION_MOVE) {
                    bitmap = imageView.getDrawingCache();
                    int pixel = bitmap.getPixel((int) motionEvent.getX(), (int) motionEvent.getY());

                    int r = Color.red(pixel);
                    int g = Color.green(pixel);
                    int b = Color.blue(pixel);
                    String hex = String.format("#%02x%02x%02x", r, g, b);
                    ColorNameLookup cnl = new ColorNameLookup();
                    String name = cnl.getColorNameFromRgb(r,g,b);
                    String tom = cnl.getColorTomFromRgb(r,g,b);

                    txtSoCor.setBackgroundColor(Color.rgb(r, g, b));
                    txtCor.setText("Cor:"+name+"\nTom:"+tom+"\nNúmero RGB: " + r + "." + g + "." + b + "\nHexadecimal: " + hex);
                }
                return true;
            }
        });

    }

    public void onClickCamera(View v) {
        Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(i, 0);
    }

    public void onClickGaleria(View view) {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("image/*");
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        startActivityForResult(intent, 1);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        InputStream stream = null;
        if (requestCode == 0 && resultCode == RESULT_OK) {
            bitmap = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(bitmap);
        } else if (requestCode == 1 && resultCode == RESULT_OK) {
            try {
                if (bitmap != null) {
                    bitmap.recycle();
                }
                stream = getContentResolver().openInputStream(data.getData());
                bitmap = BitmapFactory.decodeStream(stream);
                imageView.setImageBitmap(bitmap);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                if (stream != null)
                    try {
                        stream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            }
        }

    }
}