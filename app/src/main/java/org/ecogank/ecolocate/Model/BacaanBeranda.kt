package org.ecogank.ecolocate.Model

import android.os.Parcel
import android.os.Parcelable

data class BacaanBeranda(val image: Int,
    val judul: String,
    val isiBacaan: String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(judul)
        parcel.writeString(isiBacaan)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<BacaanBeranda> {
        override fun createFromParcel(parcel: Parcel): BacaanBeranda {
            return BacaanBeranda(parcel)
        }

        override fun newArray(size: Int): Array<BacaanBeranda?> {
            return arrayOfNulls(size)
        }
    }

}
