package com.example.myscore;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.myscore.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ActivityMainBinding binding;
    Mainviewmodel mvm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mvm = new ViewModelProvider(this).get(Mainviewmodel.class);

        if (mvm != null) {
            binding.result.setText(String.valueOf(mvm.getCount()));

        }

        binding.plusBtn.setOnClickListener(this);
        binding.minusBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.plus_btn) {
            mvm.increment();
        } else if (v.getId() == R.id.minus_btn) {
            mvm.decrement();
        }

        binding.result.setText(String.valueOf(mvm.getCount()));
    }
}
