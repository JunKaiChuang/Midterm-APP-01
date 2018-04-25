package tw.edu.ntut.csie.app01_102590007;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mEditText;
    private Button mButton;
    private TextView mResultTxtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = findViewById(R.id.inputScore);
        mButton = findViewById(R.id.btnTrans);
        mResultTxtView = findViewById(R.id.viewResult);

        mButton.setOnClickListener(btnTransOnClick);
    }

    private View.OnClickListener btnTransOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String strGrade = getString(R.string.grade);
            int score = Integer.parseInt(mEditText.getText().toString());

            LetterGrade letterGrade = new LetterGrade();
            String result = letterGrade.TransScoreToGrade(score);
            if(result == "X")
                strGrade += getString(R.string.warning);
            else
                strGrade += result;
            mResultTxtView.setText(strGrade);
        }
    };
}
