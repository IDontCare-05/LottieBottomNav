package com.wwdablu.soumya.lottiebottomnav;

public interface ILottieBottomNavCallback {
    void onMenuSelected(int oldIndex, int newIndex, MenuItemLot menuItemLot);
    void onAnimationStart(int index, MenuItemLot menuItemLot);
    void onAnimationEnd(int index, MenuItemLot menuItemLot);
    void onAnimationCancel(int index, MenuItemLot menuItemLot);
}
