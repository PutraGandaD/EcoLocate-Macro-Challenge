package org.ecogank.ecolocate.Model

import android.os.Parcel
import android.os.Parcelable

data class TPSTerdekatData(val image: Int,
    val namaTPS: String,
    val jenisTPS: String,
    val alamatTPS: String,
    val jenisSampah: String,
    val jamBukaTPS: String,
    val hariOperasionalTPS: String,
    val waTPS: String,
    val emailTPS: String,
    val latitude: Double,
    val longitude: Double
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readDouble(),
        parcel.readDouble()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(namaTPS)
        parcel.writeString(jenisTPS)
        parcel.writeString(alamatTPS)
        parcel.writeString(jenisSampah)
        parcel.writeString(jamBukaTPS)
        parcel.writeString(hariOperasionalTPS)
        parcel.writeString(waTPS)
        parcel.writeString(emailTPS)
        parcel.writeDouble(latitude)
        parcel.writeDouble(longitude)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TPSTerdekatData> {
        override fun createFromParcel(parcel: Parcel): TPSTerdekatData {
            return TPSTerdekatData(parcel)
        }

        override fun newArray(size: Int): Array<TPSTerdekatData?> {
            return arrayOfNulls(size)
        }
    }
}
