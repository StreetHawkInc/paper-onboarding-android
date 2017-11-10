package com.ramotion.paperonboarding;

import java.io.Serializable;
import java.lang.reflect.Type;

import android.app.Activity;
import android.graphics.Typeface;

/**
 * Represents content for one page of Paper Onboarding
 */
public class SHPaperOnboardingPage implements Serializable {

    private String titleText;
    private int titleColor;
    private String descriptionText;
    private int descriptionColor;
    private int bgColor;
    private String contentIconRes;
    private String bottomBarIconRes;
    private String textFont;
    private String descriptionFont;
    private String textWeight;
    private String descriptionWeight;
    private int textSize;
    private int contentSize;
    private Activity activity;
    private String placeHolder;

    public SHPaperOnboardingPage() {
    }


    /**
     * Construct a Simple and easy to use onboarding slider for your app.
     * You just need to provide content for each slider page - a main icon, text, and small round icon for the bottom.
     *
     * @param contentIconRes
     * @param titleText
     * @param descriptionText
     * @param bottomBarIconRes
     * @param bgColor
     * @param titleColor
     * @param descriptionColor
     * @param textSize
     * @param contentSize
     * @param textFont
     * @param descriptionFont
     */
    public SHPaperOnboardingPage(
            Activity activity,
            String placeHolder,
            String contentIconRes,
            String bottomBarIconRes,
            String titleText,
            String descriptionText,
            int bgColor,
            int titleColor,
            int descriptionColor,
            int textSize,
            int contentSize,
            String textFont,
            String descriptionFont,
            String textWeight,
            String descriptionWeight
    ) {
        this.activity = activity;
        this.placeHolder = placeHolder;
        this.contentIconRes = contentIconRes;
        this.titleText = titleText;
        this.descriptionText = descriptionText;
        this.bottomBarIconRes = bottomBarIconRes;
        this.bgColor = bgColor;
        this.titleColor = titleColor;
        this.descriptionColor = descriptionColor;
        this.textSize = textSize;
        this.contentSize = contentSize;
        this.textFont = textFont;
        this.descriptionFont = descriptionFont;
        this.textWeight = textWeight;
        this.descriptionWeight = descriptionWeight;
    }

    public int getTextSize() {
        return textSize;
    }

    public int getContentSize() {
        return contentSize;
    }

    public String getPlaceHolder(){
        return placeHolder;
    }

    public Activity getActivity() {
        return activity;
    }

    public String getTitleText() {
        return titleText;
    }

    public int getTitleColor()  {
        return titleColor;
    }

    public String getDescriptionText() {
        return descriptionText;
    }

    public int getDescriptionColor() {
        return descriptionColor;
    }

    public String getContentIconRes() {
        return contentIconRes;
    }

    public String getBottomBarIconRes(){ return bottomBarIconRes;}

    public int getBgColor() {
        return bgColor;
    }

    public String getDescriptionWeight() {return descriptionWeight;}

    public String getTextFont() {return textFont;}

    public String getDescriptionFont() {return descriptionFont;}

    public String getTextWeight() {return textWeight;}


   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SHPaperOnboardingPage that = (SHPaperOnboardingPage) o;

        if (bgColor != that.bgColor) return false;
        if (contentIconRes != that.contentIconRes) return false;
        if (bottomBarIconRes != that.bottomBarIconRes) return false;
        if (titleText != null ? !titleText.equals(that.titleText) : that.titleText != null)
            return false;
        return descriptionText != null ? descriptionText.equals(that.descriptionText) : that.descriptionText == null;

    }

    @Override
    public int hashCode() {
        int result = titleText != null ? titleText.hashCode() : 0;
        result = 31 * result + (descriptionText != null ? descriptionText.hashCode() : 0);
        result = 31 * result + bgColor;
        result = 31 * result + contentIconRes;
        result = 31 * result + bottomBarIconRes;
        return result;
    }

    @Override
    public String toString() {
        return "SHPaperOnboardingPage{" +
                "titleText='" + titleText + '\'' +
                ", descriptionText='" + descriptionText + '\'' +
                ", bgColor=" + bgColor +
                ", contentIconRes=" + contentIconRes +
                ", bottomBarIconRes=" + bottomBarIconRes +
                '}';
    }*/
}
