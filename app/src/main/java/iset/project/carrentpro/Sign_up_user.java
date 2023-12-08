package iset.project.carrentpro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ToggleButton;

public class Sign_up_user extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_user);
        // In your activity or fragment
        ToggleButton toggleButtonShowPassword = findViewById(R.id.toggleButtonShowPassword);
        ToggleButton toggleButtonShowPassword2 = findViewById(R.id.toggleButtonShowConfirmPassword);
        EditText editTextPassword = findViewById(R.id.editTextPassword);
        EditText editTextConfirmPassword = findViewById(R.id.editTextConfirmPassword);


        toggleButtonShowPassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Show or hide the password based on the state of the ToggleButton
                int inputType = isChecked ? InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
                        : InputType.TYPE_TEXT_VARIATION_PASSWORD | InputType.TYPE_CLASS_TEXT;
                editTextPassword.setInputType(inputType);

                // Ensure the cursor remains at the end of the text when changing the input type
                editTextPassword.setSelection(editTextPassword.getText().length());
            }
        });
        toggleButtonShowPassword2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Show or hide the password based on the state of the ToggleButton
                int inputType = isChecked ? InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
                        : InputType.TYPE_TEXT_VARIATION_PASSWORD | InputType.TYPE_CLASS_TEXT;
                editTextConfirmPassword.setInputType(inputType);

                // Ensure the cursor remains at the end of the text when changing the input type
                editTextConfirmPassword.setSelection(editTextConfirmPassword.getText().length());
            }
        });

    }
}