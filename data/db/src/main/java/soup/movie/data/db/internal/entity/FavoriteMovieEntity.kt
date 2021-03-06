package soup.movie.data.db.internal.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorite_movies")
internal data class FavoriteMovieEntity(
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: String,
    @ColumnInfo(name = "score")
    val score: Int,
    @ColumnInfo(name = "title")
    val title: String,
    @ColumnInfo(name = "posterUrl")
    val posterUrl: String,
    @ColumnInfo(name = "openDate")
    val openDate: String,
    @ColumnInfo(name = "isNow")
    val isNow: Boolean,
    @ColumnInfo(name = "age")
    val age: Int,
    @ColumnInfo(name = "nationFilter")
    val nationFilter: List<String>?,
    @ColumnInfo(name = "genres")
    val genres: List<String>?,
    @ColumnInfo(name = "boxOffice")
    val boxOffice: Int?,
    @ColumnInfo(name = "cgv")
    val cgv: String?,
    @ColumnInfo(name = "lotte")
    val lotte: String?,
    @ColumnInfo(name = "megabox")
    val megabox: String?
)
