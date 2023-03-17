package com.example.mycompleteapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NumberMainActivity extends AppCompatActivity {

    final int totalQuestions = 10;
    int totalCorrect = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.number_activity_main);
    }

    /* CHECK FOR CORRECT ANSWERS & TOAST THE RESULT */
    public void submitAnswers(View v) {
        /* Answer 1 : Radio Button : gender */
        RadioButton maleRadio = (RadioButton) findViewById(R.id.q1_male);
        if (maleRadio.isChecked()) {
            totalCorrect += 1;
            System.out.print("Male");
        }
        RadioButton femaleRadio = (RadioButton) findViewById(R.id.q1_female);
        if (femaleRadio.isChecked()) {
            totalCorrect += 1;
            System.out.print("Female");
        }
        /* Answer 2 : Edit Text : age */
        EditText ageText = (EditText) findViewById(R.id.q2_userText);
        if (!ageText.getText().toString().trim().isEmpty()) {
            totalCorrect += 1;
            System.out.print(ageText.getText().toString().trim());
        }
        /* Answer 3 : Radio Button : Hypertension  */
        RadioButton hyperYesRadio = (RadioButton) findViewById(R.id.q3_yes);
        if (hyperYesRadio.isChecked()) {
            totalCorrect += 1;
            System.out.print("Yes");
        }
        RadioButton hyperNoRadio = (RadioButton) findViewById(R.id.q3_no);
        if (hyperNoRadio.isChecked()) {
            totalCorrect += 1;
            System.out.print("No");
        }
        /* Answer 4 : Radio Button : Heart_diseases  */
        RadioButton heartYesRadio = (RadioButton) findViewById(R.id.q4_yes);
        if (heartYesRadio.isChecked()) {
            totalCorrect += 1;
            System.out.print("Yes");
        }
        RadioButton heartNoRadio = (RadioButton) findViewById(R.id.q4_no);
        if (heartNoRadio.isChecked()) {
            totalCorrect += 1;
            System.out.print("No");
        }
        /* Answer 5 : Radio Button : Ever_married  */
        RadioButton marriedYesRadio = (RadioButton) findViewById(R.id.q5_yes);
        if (marriedYesRadio.isChecked()) {
            totalCorrect += 1;
            System.out.print("Yes");
        }
        RadioButton marriedNoRadio = (RadioButton) findViewById(R.id.q5_no);
        if (marriedNoRadio.isChecked()) {
            totalCorrect += 1;
            System.out.print("No");
        }
        /* Answer 6 : Radio Button : Work_type */
        RadioButton privateRadio = (RadioButton) findViewById(R.id.q6_private);
        RadioButton selfemployedRadio = (RadioButton) findViewById(R.id.q6_selfemployed);
        RadioButton govtjobRadio = (RadioButton) findViewById(R.id.q6_govtjob);
        RadioButton childrenRadio = (RadioButton) findViewById(R.id.q6_children);
        RadioButton neverworkedRadio = (RadioButton) findViewById(R.id.q6_neverworked);
        if (privateRadio.isChecked()) {
            totalCorrect += 1;
            System.out.print("Private");
        }
        if (selfemployedRadio.isChecked()) {
            totalCorrect += 1;
            System.out.print("Self-employed");
        }
        if (govtjobRadio.isChecked()) {
            totalCorrect += 1;
            System.out.print("Govt_job");
        }
        if (childrenRadio.isChecked()) {
            totalCorrect += 1;
            System.out.print("children");
        }
        if (neverworkedRadio.isChecked()) {
            totalCorrect += 1;
            System.out.print("Never_worked");
        }

        /* Answer 7 : Radio Button : Residence_type  */
        RadioButton urbanRadio = (RadioButton) findViewById(R.id.q7_urban);
        if (urbanRadio.isChecked()) {
            totalCorrect += 1;
            System.out.print("Urban");
        }
        RadioButton ruralRadio = (RadioButton) findViewById(R.id.q7_rural);
        if (ruralRadio.isChecked()) {
            totalCorrect += 1;
            System.out.print("Rural");
        }

        /* Answer 8 : Edit Text : Avg_glucose_level */
        EditText glucoseText = (EditText) findViewById(R.id.q8_userText);
        if (!glucoseText.getText().toString().trim().isEmpty()) {
            totalCorrect += 1;
            System.out.print(glucoseText.getText().toString().trim());
        }

        /* Answer 9 : Edit Text : Bmi */
        EditText bmiText = (EditText) findViewById(R.id.q9_userText);
        if (!bmiText.getText().toString().trim().isEmpty()) {
            totalCorrect += 1;
            System.out.print(bmiText.getText().toString().trim());
        }

        /* Answer 10 : Radio Button : Smoking_status */
        RadioButton formerlysmokedRadio = (RadioButton) findViewById(R.id.q10_formerlysmoked);
        RadioButton neversmokedRadio = (RadioButton) findViewById(R.id.q10_neversmoked);
        RadioButton smokesRadio = (RadioButton) findViewById(R.id.q10_smoked);
        if (formerlysmokedRadio.isChecked()) {
            totalCorrect += 1;
            System.out.print("formerly smoked");
        }
        if (neversmokedRadio.isChecked()) {
            totalCorrect += 1;
            System.out.print("never smoked");
        }
        if (smokesRadio.isChecked()) {
            totalCorrect += 1;
            System.out.print("smokes");
        }

        /* DISPLAY THEN RESET SCORE */

        /* Show the result via Toast */

        String toastMessage;
        boolean longToast = false;

        if (totalCorrect == totalQuestions) {
            toastMessage = "All your answers are complete!";
            longToast = true;
        } else if (totalCorrect > 0) {
            toastMessage = "You got " + totalCorrect + " out of " + totalQuestions + " complete!\nTry adjusting your answers and resubmit.";
        } else {
            toastMessage = "All your answers are incomplete\nTry adjusting your answers and resubmit";
        }

        if(longToast) {
            Toast showToast = Toast.makeText(this, toastMessage, Toast.LENGTH_LONG);
            showToast.show();
        } else {
            Toast showToast = Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT);
            showToast.show();
        }

        /* Reset the score */
        totalCorrect = 0;





    }
}