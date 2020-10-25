package com.example.cuahang_client.Adapter;
import com.example.cuahang_client.Login.FragmentDangKy;
import com.example.cuahang_client.Login.FragmentDangNhap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;





public class ViewpaperAdapterDangNhap extends FragmentPagerAdapter {
//    private final List<Fragment> fragment =new ArrayList<>();
//    private final List<String> list = new ArrayList<>();

    public ViewpaperAdapterDangNhap(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                FragmentDangNhap fragmentDangNhap = new FragmentDangNhap();
                return fragmentDangNhap;
            case 1:
                FragmentDangKy fragmentDangKy = new FragmentDangKy();
                return fragmentDangKy;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Đăng nhập";
            case 1:
                return "Đăng ký";
        }
        return null;
    }
}
