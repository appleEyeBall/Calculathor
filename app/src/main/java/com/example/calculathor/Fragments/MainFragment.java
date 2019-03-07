package com.example.calculathor.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.calculathor.R;
import com.example.operation.Operation;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public MainFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance(String param1, String param2) {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    /* Declare all the views (I prefer this to calling onClick directly from xml
     * because this is more modular and helps keep view separate from controller)
     * and initialize in onCreateView.
     */

    String numOnScreen = "";
    String otherNum = "";
    String runningOperator = "";
    TextView screen;
    Button oneBtn;
    Button twoBtn;
    Button threeBtn;
    Button fourBtn;
    Button fiveBtn;
    Button sixBtn;
    Button sevenBtn;
    Button eightBtn;
    Button nineBtn;
    Button zeroBtn;
    Button dotBtn;
    Button equalBtn;
    Button plusBtn;
    Button minusBtn;
    Button timesBtn;
    Button divideBtn;
    Button cosBtn;
    Button sinBtn;
    Button tanBtn;
    Button clearBtn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_main, container, false);
        screen = (TextView) v.findViewById(R.id.screen);
        oneBtn = (Button) v.findViewById(R.id.oneBtn);
        twoBtn = (Button) v.findViewById(R.id.twoBtn);
        threeBtn = (Button) v.findViewById(R.id.threeBtn);
        fourBtn = (Button) v.findViewById(R.id.fourBtn);
        fiveBtn = (Button) v.findViewById(R.id.fiveBtn);
        sixBtn = (Button) v.findViewById(R.id.sixBtn);
        sevenBtn = (Button) v.findViewById(R.id.sevenBtn);
        eightBtn = (Button) v.findViewById(R.id.eightBtn);
        nineBtn = (Button) v.findViewById(R.id.nineBtn);
        zeroBtn = (Button) v.findViewById(R.id.zeroBtn);
        dotBtn = (Button) v.findViewById(R.id.dotBtn);
        plusBtn = (Button) v.findViewById(R.id.plusBtn);
        minusBtn = (Button) v.findViewById(R.id.minusBtn);
        timesBtn = (Button) v.findViewById(R.id.timesBtn);
        divideBtn = (Button) v.findViewById(R.id.divideBtn);
        equalBtn = (Button) v.findViewById(R.id.equalBtn);
        clearBtn = (Button) v.findViewById(R.id.clearBtn);
        cosBtn = (Button) v.findViewById(R.id.cosBtn);
        sinBtn = (Button) v.findViewById(R.id.sinBtn);
        tanBtn = (Button) v.findViewById(R.id.tanBtn);

        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateScreenNumber("1");
            }
        });
        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateScreenNumber("2");
            }
        });
        threeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateScreenNumber("3");
            }
        });
        fourBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateScreenNumber("4");
            }
        });
        fiveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateScreenNumber("5");
            }
        });
        sixBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateScreenNumber("6");
            }
        });
        sevenBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateScreenNumber("7");
            }
        });
        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateScreenNumber("8");
            }
        });
        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateScreenNumber("9");
            }
        });
        zeroBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateScreenNumber("0");
            }
        });
        dotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateScreenNumber(".");
            }
        });
        clearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("0");
                numOnScreen = "";
                otherNum = "";
                runningOperator = "";
            }
        });

        // operation buttons
        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processOperation("+");
            }
        });
        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processOperation("-");
            }
        });
        timesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processOperation("*");
            }
        });
        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processOperation("/");
            }
        });
        cosBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processOperation("cosine");

            }
        });
        sinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processOperation("sine");

            }
        });
        tanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processOperation("tangent");

            }
        });
        equalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                processOperation("=");
            }
        });
        return v;
    }

    // My functions starts here

    private void processOperation(String sign) {
        // Note running operator is the operator to be performed
        // when the user presses an operator (sign) to act as an equal
        Log.v("Oluwatise", "sign is "+ runningOperator);
        Operation operation = new Operation();
        if (runningOperator.equals("")) {
            runningOperator = sign;
        }
        if (otherNum.equals("")) {
            otherNum = numOnScreen;
            numOnScreen = "";           // empty numOnScreen to get it ready to take in more numbers
        }
        else {
            // trig functions take precedence. This part skips checking for arithmetic functions
            // and goes straight to finding the trig of what is on the screen
            if (!sign.equals("+") && !sign.equals("-") && !sign.equals("/") && !sign.equals("*") && !sign.equals("=")) {
                runningOperator = sign;
            }
            // if a trig function wasn't entered
            switch (runningOperator){
                case "+":
                    otherNum = operation.addition(otherNum, numOnScreen);
                    numOnScreen = "";
                    break;
                case "-":
                    otherNum = operation.subraction(otherNum, numOnScreen);
                    break;
                case "*":
                    Log.v("Oluwatise", "first and sec is  " +otherNum+", "+numOnScreen);
                    otherNum = operation.multiplication(otherNum,numOnScreen);
                    break;
                case "/":
                    otherNum = operation.division(otherNum,numOnScreen);
                    break;
            }

        }

        // trig functions only need one input. so we can execute them separately here
        switch (runningOperator) {
            case "=":
                if (!numOnScreen.equals("")) {
                    Log.v("Oluwatise", "num is "+ numOnScreen);
                    processOperation(runningOperator);  //recall the function, passing in the operator
                }
                else {
                    Log.v("Oluwatise", "num is "+ numOnScreen);
                    runningOperator="";
                }
                break;
            case "sine":
                otherNum = operation.sine(otherNum);
                break;
            case "cosine":
                otherNum = operation.cosine(otherNum);
                break;
            case "tangent":
                otherNum = operation.tangent(otherNum);
                break;
        }
        screen.setText(otherNum);
        numOnScreen = "";
        if (!sign.equals("=")) {        // '='cannot be used in future operations so why store it?
            runningOperator = sign;
        }
    }

    private void updateScreenNumber(String number) {
        numOnScreen+=number;
        screen.setText(numOnScreen);

    }

}


