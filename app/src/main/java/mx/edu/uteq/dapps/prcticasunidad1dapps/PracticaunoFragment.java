package mx.edu.uteq.dapps.prcticasunidad1dapps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import mx.edu.uteq.dapps.prcticasunidad1dapps.databinding.FragmentPracticadosBinding;
import mx.edu.uteq.dapps.prcticasunidad1dapps.databinding.FragmentPracticaunoBinding;

public class PracticaunoFragment extends Fragment {

    private FragmentPracticaunoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentPracticaunoBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}