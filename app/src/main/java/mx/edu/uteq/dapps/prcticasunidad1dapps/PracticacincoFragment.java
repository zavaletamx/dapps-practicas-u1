package mx.edu.uteq.dapps.prcticasunidad1dapps;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import mx.edu.uteq.dapps.prcticasunidad1dapps.databinding.FragmentPracticacincoBinding;

public class PracticacincoFragment extends Fragment {

    private FragmentPracticacincoBinding binding;

    private Timer timer;
    private int timeCounter;
    private int numeroAdivinar;
    private int vidas = 4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentPracticacincoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        numeroAdivinar = new Random().nextInt(50); //Número aleatorio del 0 al 50

        Toast.makeText(
                getActivity(),
                "Número a adivinar:" + numeroAdivinar,
                Toast.LENGTH_LONG
        ).show();

        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                binding.tvTiempo.setText(String.valueOf(timeCounter));
                timeCounter++;
            }
        }, 1000, 1000);

        binding.btnAdivinar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int numero = Integer.parseInt(binding.tietAdivinaNumero.getText().toString());

                if (numero == numeroAdivinar) {
                    binding.tvNumeroUsuario.setText("GANASTE");
                }

                else if (numero > numeroAdivinar) {
                    binding.tvNumeroUsuario.setText("TU NÚMERO ES MAYOR");
                    vidas--;
                    mostrarVidas();
                }

                else if (numero < numeroAdivinar) {
                    binding.tvNumeroUsuario.setText("TU NÚMERO ES MENOR");

                    vidas--;
                    mostrarVidas();
                }
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        timer.cancel();
        binding = null;
    }

    private void mostrarVidas() {
        binding.tvContadorVidas.setText("");
        for (int i = 0; i < vidas; i++) {
            binding.tvContadorVidas.setText(binding.tvContadorVidas.getText() + " ♥ ");
        }
    }
}