
package com.example.rafael.mapalang;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.TextView;

        import org.w3c.dom.Text;

/**
 * Created by rafael on 31/10/2016.
 */

public class BemVindo extends AppCompatActivity {

    TextView mTextView1, mTextView2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bem_vindo);

        mTextView1 = (TextView) findViewById(R.id.bemVindo);
        mTextView2 = (TextView) findViewById(R.id.continua);

        mTextView2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(BemVindo.this,LoginActivity.class);
                startActivity(it);
            }
        });

    }
}