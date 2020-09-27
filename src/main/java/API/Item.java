package API;

import com.google.gson.annotations.SerializedName;

public class Item {
    @SerializedName("animetwist:id")
    public int id;
    @SerializedName("anime:title")
    public String title;

    public String description;
    public String link;
}
