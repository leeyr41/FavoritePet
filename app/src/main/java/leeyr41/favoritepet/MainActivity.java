package leeyr41.favoritepet;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static leeyr41.favoritepet.R.*;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener, View.OnClickListener{
    CheckBox checkSelect;
    RadioGroup rg;
    RadioButton radiocat, radiog, radiopig;
    Button butok;
    ImageView imgvPet;
    TextView textquest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        checkSelect=(CheckBox)findViewById(R.id.check_select);
        rg=(RadioGroup) findViewById(R.id.rg);
        radiocat=(RadioButton)findViewById(R.id.radio_cat);
        radiog=(RadioButton)findViewById(id.radio_g);
        radiopig=(RadioButton)findViewById(id.radio_pig);
        butok=(Button)findViewById(id.but_ok);
        imgvPet=(ImageView)findViewById(id.imgv_pet);
        textquest=(TextView)findViewById(id.text_quest); 
        checkSelect.setOnCheckedChangeListener(this);
        butok.setOnClickListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if(checkSelect.isChecked()){
            textquest.setVisibility(View.VISIBLE);
            rg.setVisibility(View.VISIBLE);
            butok.setVisibility(View.VISIBLE);
            imgvPet.setVisibility(View.VISIBLE);
        }else{
            textquest.setVisibility(View.INVISIBLE);
            rg.setVisibility(View.INVISIBLE);
            butok.setVisibility(View.INVISIBLE);
            imgvPet.setVisibility(View.INVISIBLE);
        }
    }

    @Override

    public void onClick(View v) {
        switch(rg.getCheckedRadioButtonId()) {
            case R.id.radio_cat:
                imgvPet.setImageResource(drawable.cat);
                break;
            case R.id.radio_g:
                imgvPet.setImageResource(drawable.g);
                break;
            case R.id.radio_pig:
                imgvPet.setImageResource(drawable.pig);
                break;
            default:
                Toast.makeText(this, "라디오 버튼이 하나도 선택이 안되었네요.",Toast.LENGTH_SHORT).show();
        }
    }
}
