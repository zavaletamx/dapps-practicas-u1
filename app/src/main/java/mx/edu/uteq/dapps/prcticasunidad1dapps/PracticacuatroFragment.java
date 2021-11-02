package mx.edu.uteq.dapps.prcticasunidad1dapps;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mx.edu.uteq.dapps.prcticasunidad1dapps.databinding.FragmentPracticacuatroBinding;

public class PracticacuatroFragment extends Fragment {

    private FragmentPracticacuatroBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentPracticacuatroBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}