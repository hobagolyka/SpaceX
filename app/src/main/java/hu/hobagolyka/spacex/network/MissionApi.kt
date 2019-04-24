package hu.hobagolyka.spacex.network

import android.telecom.Call
import jdk.nashorn.internal.runtime.PropertyDescriptor.GET
import io.swagger.client.CollectionFormats.*
import retrofit2.Call
import retrofit2.http.*
import okhttp3.RequestBody
import io.swagger.client.model.Mission
import jdk.nashorn.internal.runtime.PropertyDescriptor.GET

interface MissionApi {

    /**
     * Return all missions.
     * Return all missions.
     * @param body get all misisons
     * @return Call<Void>
    </Void> */

    @GET("missions")
    fun getMissions(
        @Body body: Mission
    ): Call<Void>


    /**
     * get one mission by id
     *
     * @param missionId id of a mission
     * @return Call<Mission>
    </Mission> */

    @GET("missions/{mission_id}")
    fun getMissionById(
        @Path("mission_id") missionId: String
    ): Call<Mission>


}
