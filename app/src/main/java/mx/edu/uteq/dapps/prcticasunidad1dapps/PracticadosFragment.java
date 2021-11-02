package mx.edu.uteq.dapps.prcticasunidad1dapps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import mx.edu.uteq.dapps.prcticasunidad1dapps.databinding.FragmentPracticadosBinding;

public class PracticadosFragment extends Fragment {

    private FragmentPracticadosBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentPracticadosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();



        return root;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}