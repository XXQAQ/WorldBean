package com.xq.worldbean.bean.entity.base;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.PixelFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.xq.worldbean.bean.behavior.BaseBehavior;
import com.xq.worldbean.util.callback.TCallback;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;

public class BaseBean implements BaseBehavior,Parcelable {

    protected Object tag;
    protected String id;
    protected String foreignId;
    protected TCallback callback;

    public BaseBean() {
    }

    public BaseBean(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BaseBean{" +
                "tag=" + tag +
                ", id='" + id + '\'' +
                ", foreignId='" + foreignId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BaseBean that = (BaseBean) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        return foreignId != null ? foreignId.equals(that.foreignId) : that.foreignId == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (foreignId != null ? foreignId.hashCode() : 0);
        return result;
    }

    @Override
    public Object getTag() {
        return tag;
    }

    @Override
    public void setTag(Object tag) {
        this.tag = tag;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getForeignId() {
        return foreignId;
    }

    @Override
    public void setForeignId(String foreignId) {
        this.foreignId = foreignId;
    }

    @Override
    public TCallback getCallback() {
        return callback;
    }

    @Override
    public void setCallback(TCallback callback) {
        this.callback = callback;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(foreignId);
        writeObject(dest,flags,tag);
    }

    protected BaseBean(Parcel in) {
        this.id = in.readString();
        this.foreignId = in.readString();
        this.tag = readObject(in);
    }

    public static final Parcelable.Creator<BaseBean> CREATOR = new Parcelable.Creator<BaseBean>() {
        @Override
        public BaseBean createFromParcel(Parcel in) {
            return new BaseBean(in);
        }

        @Override
        public BaseBean[] newArray(int size) {
            return new BaseBean[size];
        }
    };

    protected static void writeObject(Parcel dest,int flags,Object object) {

        if (object == null)
        {
            dest.writeString("null");
        }
        else
        {
            dest.writeString(object.getClass().getName());

            if (object instanceof Parcelable)
            {
                dest.writeParcelable((Parcelable) object,flags);
            }
            else    if (object instanceof Serializable)
            {
                dest.writeSerializable((Serializable) object);
            }
        }
    }

    protected static Object readObject(Parcel in) {

        String className = in.readString();

        try {
            Class mClass = Class.forName(className);

            if (Parcelable.class.isAssignableFrom(mClass))
            {
                return in.readParcelable(mClass.getClassLoader());
            }
            else    if (Serializable.class.isAssignableFrom(mClass))
            {
                return in.readSerializable();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }

    protected static void writeDrawable(Parcel dest, Drawable drawable){

        if (drawable == null)
        {
            dest.writeByteArray(new byte[]{0});
        }
        else
        {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

            drawable2Bitmap(drawable).compress(Bitmap.CompressFormat.PNG, 100, outputStream);

            dest.writeByteArray(outputStream.toByteArray());
        }
    }

    protected static Drawable readDrawable(Parcel in){

        byte[] bytes = in.createByteArray();

        try {
            Drawable drawable = new BitmapDrawable(BitmapFactory.decodeByteArray(bytes,0,bytes.length));

            return drawable;
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    protected static Bitmap drawable2Bitmap(final Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        Bitmap bitmap;
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            bitmap = Bitmap.createBitmap(1, 1,
                    drawable.getOpacity() != PixelFormat.OPAQUE
                            ? Bitmap.Config.ARGB_8888
                            : Bitmap.Config.RGB_565);
        } else {
            bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(),
                    drawable.getIntrinsicHeight(),
                    drawable.getOpacity() != PixelFormat.OPAQUE
                            ? Bitmap.Config.ARGB_8888
                            : Bitmap.Config.RGB_565);
        }
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmap;
    }

}
