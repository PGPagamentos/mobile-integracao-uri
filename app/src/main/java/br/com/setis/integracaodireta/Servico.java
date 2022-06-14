package br.com.setis.integracaodireta;

import android.app.IntentService;
import android.content.Intent;

import androidx.annotation.Nullable;

public class Servico extends IntentService {

    public Servico() {
        super("ComunicacaoServico");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

    }
}
