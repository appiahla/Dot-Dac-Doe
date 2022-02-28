package com.example.dot_dac_doe;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

//public class Settings extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_settings);
//    }
//}

class Settings : Settings(){
private var binding:SettingsBinding? = null
private val binding get() = binding!!

        override fun onCreateView(
        inflater:LayoutInflater,container:ViewGroup?,savedInstanceState:Bundle?
        ):View {
        binding = SettingsBinding.inflate(inflater,container,false)
        val langauges=resources.getString(R.array.languages)
        val arrayAdapter=ArrayAdapter(requireContext(),R.layout.dropdown_item,langauges)
        binding.autoCompleteTextView.SetAdapter(arrayAdapter)

        return binding.root
        }
        override fun onDestroyView(){
        super.onDestroyView()
        binding=null
        }

}

