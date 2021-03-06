package senanayake.udayanga.com.moviecollection;

import android.graphics.Bitmap;

/**
 * Created by Udayanga on 11/6/2017.
 */

public class Movie {
    public int mMovieId;
    public String mMovieName;
    public String mImageUrl;
    public String mMovieContent;
    public String mBookingStartDate;
    public String mReleaseDate;
    public String mEndDate;
    public float mImdbRate;
    public String mTrailerUrl;
    public String mUrlKey;
    public String mGenre;
    
    public Bitmap bitmap;

    public Movie(String mMovieName, float mImdbRate, Bitmap bitmap) {
        this.mMovieName = mMovieName;
        this.mImdbRate = mImdbRate;
        this.bitmap = bitmap;
    }

    public Movie(String mMovieName, String mBookingStartDate, String mReleaseDate, String mEndDate, float mImdbRate,  Bitmap bitmap) {
        this.mMovieName = mMovieName;
        this.mBookingStartDate = mBookingStartDate;
        this.mReleaseDate = mReleaseDate;
        this.mEndDate = mEndDate;
        this.mImdbRate = mImdbRate;
        this.bitmap = bitmap;
    }
}
