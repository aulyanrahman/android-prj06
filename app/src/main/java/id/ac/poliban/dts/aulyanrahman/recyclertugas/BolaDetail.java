package id.ac.poliban.dts.aulyanrahman.recyclertugas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class BolaDetail extends AppCompatActivity {
    private TextView tvNameDetail;
    private TextView tvDetailDetail;
    private ImageView imgPhotoDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola_detail);

        tvNameDetail = findViewById(R.id.tv_detail_name);
        tvDetailDetail = findViewById(R.id.tv_detail_detail);
        imgPhotoDetail = findViewById(R.id.img_detail_photo);

        if (getIntent().getExtras() !=null)
            showBolaDetail();
    }

    private void showBolaDetail() {
        Bola bola = (Bola) getIntent().getSerializableExtra("bola");
        Glide.with(this)
                .load(bola.getPhoto())
                .apply(new RequestOptions().override(220, 220))
                .into(imgPhotoDetail);
        tvNameDetail.setText(bola.getName());
        tvDetailDetail.setText(bola.getDetail());
    }
}