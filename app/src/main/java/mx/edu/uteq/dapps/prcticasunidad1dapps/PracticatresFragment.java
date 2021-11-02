package mx.edu.uteq.dapps.prcticasunidad1dapps;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mx.edu.uteq.dapps.prcticasunidad1dapps.databinding.FragmentPracticatresBinding;

public class PracticatresFragment extends Fragment {

    private FragmentPracticatresBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentPracticatresBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}