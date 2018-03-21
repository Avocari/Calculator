package at.sw2018.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity implements View.OnClickListener{

    TextView numberView;
    Button buttonPlus,buttonMin,buttonDiv,buttonMult,buttonClear,buttonEqu,button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        buttonPlus  = (Button) findViewById(R.id.buttonPlus);
        buttonMin   = (Button) findViewById(R.id.buttonMin);
        buttonDiv   = (Button) findViewById(R.id.buttonDiv);
        buttonMult  = (Button) findViewById(R.id.buttonMult);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonEqu   = (Button) findViewById(R.id.buttonEqu);
        button0     = (Button) findViewById(R.id.button0);
        button1     = (Button) findViewById(R.id.button1);
        button2     = (Button) findViewById(R.id.button2);
        button3     = (Button) findViewById(R.id.button3);
        button4     = (Button) findViewById(R.id.button4);
        button5     = (Button) findViewById(R.id.button5);
        button6     = (Button) findViewById(R.id.button6);
        button7     = (Button) findViewById(R.id.button7);
        button8     = (Button) findViewById(R.id.button8);
        button9     = (Button) findViewById(R.id.button9);

        numberView = (TextView) findViewById(R.id.textView);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMin.setOnClickListener(this);
        buttonMult.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);
        buttonEqu.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
    }

    private void clearTextView(){
        numberView.setText("0");
    }

    @Override
    public void onClick(View view) {

        Button clickedButton = (Button) view;
        switch(clickedButton.getId()) {
            case R.id.buttonPlus:
                break;
            case R.id.buttonMin:
                break;
            case R.id.buttonMult:
                break;
            case R.id.buttonDiv:
                break;
            case R.id.buttonEqu:
                break;
            case R.id.buttonClear:
                clearTextView();
                break;
            default:
                String recentNumber = numberView.getText().toString();

                if(recentNumber.equals("0")){
                    recentNumber = "";
                }
                recentNumber += clickedButton.getText().toString();
                numberView.setText(recentNumber);
        }

    }
}
