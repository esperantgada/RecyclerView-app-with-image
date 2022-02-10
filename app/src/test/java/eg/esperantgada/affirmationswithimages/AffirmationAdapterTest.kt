package eg.esperantgada.affirmationswithimages

import android.content.Context
import com.example.affirmationswithimages.R
import eg.esperantgada.affirmationswithimages.adapter.ItemAdapter
import eg.esperantgada.affirmationswithimages.model.Affirmation
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

/**
 * Here, we want to test the method [getItemCount] of the adapter
 * [mock] library allows us to create a [context] that the [adapter] needs
 * We test if this method will return the [size] of data by using [unit] test
 */

class AffirmationAdapterTest {

    private val context = mock(Context::class.java)

    @Test
    fun adapter_size(){
        val affirmations = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )

        val adapter = ItemAdapter(context, affirmations)

        assertEquals("ItemAdapter doesn't return the correct size", affirmations.size, adapter.itemCount)
    }

}