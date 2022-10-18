package com.luqmanalhakim.uts.pilihhero;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends Activity {
    Activity activity;

    private EditText seNick;

    RadioGroup rgHero, rgKelas, rgItem;
    RadioButton rbSummoner, rbWarrior, rbArcher, rbMage,
                rbKelas1, rbKelas2,
                rbAtk, rbSta, rbMspd, rbDamage;
    String chooseClass, heroClass, heroItem;
    int rateHero, rateClass, rateItem, totalRate;
    ImageView changePic;
    TextView hasil;
    Button choosed;




    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;

        seNick = (EditText) findViewById(R.id.amNick);

        rgHero = (RadioGroup) findViewById(R.id.amRgHero);
        rbSummoner = (RadioButton) findViewById(R.id.amRbSummoner);
        rbWarrior = (RadioButton) findViewById(R.id.amRbWarrior);
        rbArcher = (RadioButton) findViewById(R.id.amRbArcher);
        rbMage = (RadioButton) findViewById(R.id.amRbMage);

        rgKelas = (RadioGroup) findViewById(R.id.amRgKelas);
        rbKelas1 = (RadioButton) findViewById(R.id.amRbKelas1);
        rbKelas2 = (RadioButton) findViewById(R.id.amRbKelas2);

        rgItem = (RadioGroup) findViewById(R.id.amRgItem);
        rbAtk = (RadioButton) findViewById(R.id.amRbAtk);
        rbSta = (RadioButton) findViewById(R.id.amRbSta);
        rbMspd = (RadioButton) findViewById(R.id.amRbMspd);
        rbDamage = (RadioButton) findViewById(R.id.amRbDamage);

        rbSummoner.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (rbSummoner.isChecked()) {
                    heroClass = "Summoner";
                    rateHero = 15000;
                    rbKelas1.setText("TypeS");
                    rbKelas2.setText("TypeR");
                }
            }
        });

        rbWarrior.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (rbWarrior.isChecked()) {
                    heroClass = "Warrior";
                    rateHero = 12000;
                    rbKelas1.setText("Champion");
                    rbKelas2.setText("Paladin");
                }
            }
        });

        rbArcher.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (rbArcher.isChecked()) {
                    heroClass = "Archer";
                    rateHero = 13000;
                    rbKelas1.setText("Hunter");
                    rbKelas2.setText("Sniper");
                }
            }
        });

        rbMage.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (rbMage.isChecked()) {
                    heroClass = "Mage";
                    rateHero = 10000;
                    rbKelas1.setText("Wizard");
                    rbKelas2.setText("Sorcerer");
                }
            }
        });

        rbKelas1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (rbKelas1.isChecked()){
                    if(rbKelas1.getText().toString().equals("TypeS")) {
                        chooseClass = "TypeS";
                        changePic.setImageResource(R.drawable.types);
                        rateClass = 10000;
                    } else if (rbKelas1.getText().toString().equals("Champion")){
                        chooseClass = "Champion";
                        changePic.setImageResource(R.drawable.champion);
                        rateClass = 3000;
                    } else if (rbKelas1.getText().toString().equals("Hunter")){
                        chooseClass = "Hunter";
                        changePic.setImageResource(R.drawable.hunter);
                        rateClass = 6000;
                    } else if (rbKelas1.getText().toString().equals("Wizard")) {
                        chooseClass = "Wizard";
                        changePic.setImageResource(R.drawable.wizard);
                        rateClass = 7000;
                    }
                }
            }
        });

        rbKelas2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (rbKelas2.isChecked()){
                    if(rbKelas2.getText().toString().equals("TypeR")) {
                        chooseClass = "TypeR";
                        changePic.setImageResource(R.drawable.typer);
                        rateClass = 7500;
                    } else if (rbKelas2.getText().toString().equals("Paladin")){
                        chooseClass = "Paladin";
                        changePic.setImageResource(R.drawable.paladin);
                        rateClass = 2000;
                    } else if (rbKelas2.getText().toString().equals("Sniper")){
                        chooseClass = "Sniper";
                        changePic.setImageResource(R.drawable.sniper);
                        rateClass = 5000;
                    } else if (rbKelas2.getText().toString().equals("Sorcerer")) {
                        chooseClass = "Sorcerer";
                        changePic.setImageResource(R.drawable.sorcerer);
                        rateClass = 6000;
                    }
                }
            }
        });

        rbAtk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (rbAtk.isChecked()){
                    heroItem = "ATK Blessing";
                    rateItem = 15000;
                }
            }
        });

        rbSta.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (rbSta.isChecked()){
                    heroItem = "STA Box";
                    rateItem = 20000;
                }
            }
        });

        rbMspd.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (rbMspd.isChecked()){
                    heroItem = "MSPD Box";
                    rateItem = 5000;
                }
            }
        });

        rbDamage.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (rbDamage.isChecked()){
                    heroItem = "Damage Box";
                    rateItem = 30000;
                }
            }
        });


        hasil = (TextView) findViewById(R.id.txtTampil);
        changePic = (ImageView) findViewById(R.id.amGambar);
        choosed = (Button) findViewById(R.id.btnChoose);
        choosed.setOnClickListener(new tampilGan());

    }

    class tampilGan implements Button.OnClickListener {
        public void onClick(View v) {
            totalRate = rateHero+rateClass+rateItem;

            hasil.setText(
                    "Nick Anda\t\t: "+seNick.getText()+"\n"+
                            "------"+"\n"+
                            "Jenis Hero\t\t: "+heroClass+"\n"+
                            "Kelas Hero\t\t: "+chooseClass+"\n"+
                            "Item Hero\t\t: "+heroItem+"\n"+
                            "------"+"\n"+
                            "Rate Hero\t\t: "+rateHero+"\n"+
                            "Rate Kelas\t\t: "+rateClass+"\n"+
                            "Rate Item\t\t\t: "+rateItem+"\n"+
                            "------"+"\n"+
                            "Total Rate\t\t: "+totalRate);

        }
    }
}