package com.example.lab09plataformas
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import coil.load
import coil.request.CachePolicy
import coil.transform.CircleCropTransformation

class Lista_characters : Fragment(R.layout.fragment_lista_characters) {
private lateinit var characterImage : ImageView
private lateinit var characterName : TextView
private lateinit var characterSpecies : TextView
private lateinit var characterStatus : TextView
private lateinit var characterGender : TextView

private val args:Lista_characters by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        characterImage = view.findViewById(R.id.image_view_characterdeatil)
        characterName = view.findViewById(R.id.image_view_characterdeatil)
        characterSpecies = view.findViewById(R.id.textRace_characterDetail_fragment)
        characterStatus = view.findViewById(R.id.textAliveDeath_characterDetail_fragment)
        characterGender = view.findViewById(R.id.textMaleFemale_characterDetail_fragment)

        setImage()
        setInfo()

    }
    private fun setInfo() {
        characterName.text = args.characterName.toString()
        characterSpecies.text = args.characterSpecies.toString()
        characterStatus.text = args.characterStatus.toString()
        characterGender.text = args.characterGender.toString()
    }
    private fun setImage() {
        characterImage.load(args.characterImage) {
            transformations(CircleCropTransformation())
            diskCachePolicy(CachePolicy.ENABLED)
            memoryCachePolicy(CachePolicy.ENABLED)
        }
    }
}


