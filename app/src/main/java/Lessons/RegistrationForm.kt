package Lessons

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class RegistrationForm : Fragment() {

    private var _binding: RegistrationForm? = null
    private val binding get() = binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = RegistrationFormBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.loginButtom.setOnClickListener {
            Toast.makeText(this.context "не жми", Toast.LENGTH_SHORT).show()
            binding.loginButton.isEnabled = binding.passwordEditText.text.length > 8
        }
    }
}