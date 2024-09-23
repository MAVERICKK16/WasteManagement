package com.example.wastenewgroupapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.wastenewgroupapplication.R;
import com.example.wastenewgroupapplication.databinding.ActivityWasteOptionBinding;

public class WasteOptionActivity extends AppCompatActivity {
    ActivityWasteOptionBinding binding;
    int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityWasteOptionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        int[] img=new int[]{R.drawable.ic_plastic,R.drawable.ic_glass,R.drawable.ic_ewaste,R.drawable.ic_otherwaste};
        String[] acname={"Plastics","Glass","E-Waste","Others"};
        String[] about={"Plastic is a synthetic substance that is non-bio-degradable. We use it indiscriminately in almost all day-to-day products. Environmental contamination comes from plastic accumulation. Land, rivers and oceans are plagued by its accumulation",
                "Glass waste poses significant environmental challenges due to its non-biodegradable nature and potential to leach harmful chemicals into soil and water systems. Recycling glass not only reduces landfill burden but also conserves energy by melting it at lower temperatures than producing new glass.",
                "E-waste, consisting of discarded electronic devices like computers and smartphones, poses a growing environmental threat due to toxic components such as lead and mercury. Proper recycling and disposal methods are crucial to mitigate pollution and recover valuable materials for reuse in new electronics.",
                "Waste, encompassing various materials from organic to inorganic, presents a multifaceted environmental challenge, impacting ecosystems and human health. Effective waste management strategies, including reduction, reuse, recycling, and proper disposal, are essential for mitigating pollution, conserving resources, and promoting a sustainable future."};
        i=getIntent().getIntExtra("id",0);
        binding.wastetxt.setText(""+acname[i]);
        binding.wasteimg.setImageResource(img[i]);
        binding.abouttxt.setText(""+about[i]);
    }
}