package com.google.samples.apps.sunflower


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
/*import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.google.samples.apps.sunflower.adapters.GardenPlantingAdapter
import com.google.samples.apps.sunflower.databinding.FragmentGardenBinding
import com.google.samples.apps.sunflower.utilities.InjectorUtils
import com.google.samples.apps.sunflower.viewmodels.GardenPlantingListViewModel*/

class ClaimsFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? =
            inflater.inflate(R.layout.claims_list, container, false)
    /* val binding = FragmentGardenBinding.inflate(inflater, container, false)
     val adapter = GardenPlantingAdapter()
     binding.gardenList.adapter = adapter
     subscribeUi(adapter, binding)
     return binding.root*/
}

/*private fun subscribeUi(adapter: GardenPlantingAdapter, binding: FragmentGardenBinding) {
    val factory = InjectorUtils.provideGardenPlantingListViewModelFactory(requireContext())
    val viewModel = ViewModelProviders.of(this, factory)
            .get(GardenPlantingListViewModel::class.java)

    viewModel.gardenPlantings.observe(viewLifecycleOwner, Observer { plantings ->
        binding.hasPlantings = (plantings != null && plantings.isNotEmpty())
    })

    viewModel.plantAndGardenPlantings.observe(viewLifecycleOwner, Observer { result ->
        if (result != null && result.isNotEmpty())
            adapter.submitList(result)
    })
}
}*/
