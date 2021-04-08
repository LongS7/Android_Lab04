package com.example.android_lab04;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AboveFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AboveFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private int quantity;
    private double price;
    private SendData sendData;

    public AboveFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        sendData = (SendData) context;

        super.onAttach(context);
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AboveFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AboveFragment newInstance(String param1, String param2) {
        AboveFragment fragment = new AboveFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_above, container, false);

        ImageButton imgAdd = view.findViewById(R.id.imgAdd);
        ImageButton imgSub = view.findViewById(R.id.imgSub);
        TextView tvQuantity = view.findViewById(R.id.tvQuantity);
        TextView tvPrice = view.findViewById(R.id.tvPrice);

        quantity = Integer.parseInt(tvQuantity.getText().toString());
        String textPrice = tvPrice.getText().toString().replace(".", "").replace(" đ", "");

        price = Double.parseDouble(textPrice);

        imgAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity ++;
                tvQuantity.setText(String.valueOf(quantity));
                sendData.send(price, quantity);
            }
        });

        imgSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity < 1)
                    return;

                quantity --;
                tvQuantity.setText(String.valueOf(quantity));
                sendData.send(price, quantity);
            }
        });

        // Inflate the layout for this fragment
        return view;
    }
}