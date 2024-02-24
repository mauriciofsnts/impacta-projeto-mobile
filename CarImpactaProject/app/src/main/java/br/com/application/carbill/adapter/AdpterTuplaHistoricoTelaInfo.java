package br.com.application.carbill.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.ArrayList;

import br.com.application.carbill.R;
import br.com.application.carbill.model.ClassHistoricoDeViagem;

public class AdpterTuplaHistoricoTelaInfo extends ArrayAdapter<ClassHistoricoDeViagem> {

    private final Context context;
    private final ArrayList<ClassHistoricoDeViagem> viagem;

    public AdpterTuplaHistoricoTelaInfo(Context context, ArrayList<ClassHistoricoDeViagem> viagem){
        super(context, R.layout.tupla_historico, viagem);
        this.context = context;
        this.viagem = viagem;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.tupla_historico, parent, false);

        TextView data = (TextView) rowView.findViewById(R.id.txtData);
        TextView tipo = (TextView) rowView.findViewById(R.id.txtTipo);
        TextView valor = (TextView) rowView.findViewById(R.id.txtValor);

        data.setText(viagem.get(position).getData());
        if(viagem.get(position).getIdTipo() == 1)
            tipo.setText("IDA");
        else
            tipo.setText("VOLTA");

        String valorFormatado = NumberFormat.getCurrencyInstance().format(viagem.get(position).getValor());
        valor.setText(valorFormatado);

        return rowView;
    }
}

