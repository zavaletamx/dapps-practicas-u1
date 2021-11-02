package mx.edu.uteq.dapps.prcticasunidad1dapps;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavHostController;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mx.edu.uteq.dapps.prcticasunidad1dapps.databinding.FragmentMenuBinding;

public class MenuFragment extends Fragment {

    private FragmentMenuBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentMenuBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        binding.btnMenuP1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(MenuFragment.this).navigate(R.id.action_m_to_p1);
            }
        });

        binding.btnMenuP2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(MenuFragment.this).navigate(R.id.action_m_to_p2);
            }
        });

        binding.btnMenuP3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(MenuFragment.this).navigate(R.id.action_m_to_p3);
            }
        });

        binding.btnMenuP4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(MenuFragment.this).navigate(R.id.action_m_to_p4);
            }
        });

        binding.btnMenuP5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NavHostFragment.findNavController(MenuFragment.this).navigate(R.id.action_m_to_p5);
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}