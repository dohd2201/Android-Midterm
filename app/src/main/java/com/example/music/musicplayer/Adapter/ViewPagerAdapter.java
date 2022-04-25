package com.example.music.musicplayer.Adapter;

import android.content.ContentResolver;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.music.musicplayer.Fragments.OfflineSongFragment;
import com.example.music.musicplayer.Fragments.OnlineSongFragment;
import com.example.music.musicplayer.Fragments.FavSongFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private ContentResolver contentResolver;
    private String title[] = {"MUSIC OFFLINE","MUSIC ONLINE", "FAVORITES"};

    public ViewPagerAdapter(FragmentManager fm, ContentResolver contentResolver) {
        super(fm);
        this.contentResolver = contentResolver;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return OfflineSongFragment.getInstance(position, contentResolver);
            case 1:
                return OnlineSongFragment.getInstance(position);
            case 2:
                return FavSongFragment.getInstance(position);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
