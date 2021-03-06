package idv.example.johnwang.homework1;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private EditText etName, etPhone;
    private CheckBox cbSave;
    private TextView tvResult;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvResult.setText(Result());
            }
        });
    }

    private void findViews() {
        etName = (EditText) findViewById(R.id.etName);
        etPhone = (EditText) findViewById(R.id.etPhone);
        cbSave = (CheckBox) findViewById(R.id.cbSave);
        tvResult = (TextView) findViewById(R.id.tvResult);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);
    }

    private String Result() {
        String name = etName.getText().toString();
        String phone = etPhone.getText().toString();
        String cbResult;
        String result;

        if (cbSave.isChecked()) {
            cbResult = getString(R.string.save);
        } else {
            cbResult = " ";
        }
        result = getString(R.string.name) + name + "\n" + getString(R.string.phone) + phone + "\n" + cbResult;
        return result;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
