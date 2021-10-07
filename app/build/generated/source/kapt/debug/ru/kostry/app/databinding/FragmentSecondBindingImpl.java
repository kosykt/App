package ru.kostry.app.databinding;
import ru.kostry.app.R;
import ru.kostry.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSecondBindingImpl extends FragmentSecondBinding implements ru.kostry.app.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.btn_next_second_fragment, 6);
        sViewsWithIds.put(R.id.divider, 7);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSecondBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentSecondBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[6]
            , (android.view.View) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[5]
            );
        this.btnBackSecondFragment.setTag(null);
        this.photosGrid.setTag(null);
        this.secondFragmentIntMessage.setTag(null);
        this.secondFragmentStringMessage.setTag(null);
        this.secondFrg.setTag(null);
        this.statusImage.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new ru.kostry.app.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.secondFragment == variableId) {
            setSecondFragment((ru.kostry.app.ui.view.SecondFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((ru.kostry.app.ui.viewmodel.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSecondFragment(@Nullable ru.kostry.app.ui.view.SecondFragment SecondFragment) {
        this.mSecondFragment = SecondFragment;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.secondFragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable ru.kostry.app.ui.viewmodel.MainViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelPhotos((androidx.lifecycle.LiveData<java.util.List<ru.kostry.app.network.MarsPhoto>>) object, fieldId);
            case 1 :
                return onChangeViewModelStatus((androidx.lifecycle.LiveData<ru.kostry.app.ui.viewmodel.MarsApiStatus>) object, fieldId);
            case 2 :
                return onChangeViewModelMyString((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeViewModelMyNumber((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelPhotos(androidx.lifecycle.LiveData<java.util.List<ru.kostry.app.network.MarsPhoto>> ViewModelPhotos, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelStatus(androidx.lifecycle.LiveData<ru.kostry.app.ui.viewmodel.MarsApiStatus> ViewModelStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMyString(androidx.lifecycle.LiveData<java.lang.String> ViewModelMyString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMyNumber(androidx.lifecycle.LiveData<java.lang.Integer> ViewModelMyNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        ru.kostry.app.ui.view.SecondFragment secondFragment = mSecondFragment;
        androidx.lifecycle.LiveData<java.util.List<ru.kostry.app.network.MarsPhoto>> viewModelPhotos = null;
        java.lang.String viewModelMyStringToString = null;
        androidx.lifecycle.LiveData<ru.kostry.app.ui.viewmodel.MarsApiStatus> viewModelStatus = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelMyString = null;
        java.lang.String secondFragmentStringMessageAndroidStringUserTextViewModelMyStringToString = null;
        java.lang.Integer viewModelMyNumberGetValue = null;
        ru.kostry.app.ui.viewmodel.MarsApiStatus viewModelStatusGetValue = null;
        java.util.List<ru.kostry.app.network.MarsPhoto> viewModelPhotosGetValue = null;
        java.lang.String viewModelMyStringGetValue = null;
        ru.kostry.app.ui.viewmodel.MainViewModel viewModel = mViewModel;
        java.lang.String secondFragmentIntMessageAndroidStringUserNumberViewModelMyNumber = null;
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelMyNumber = null;

        if ((dirtyFlags & 0x6fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.photos
                        viewModelPhotos = viewModel.getPhotos();
                    }
                    updateLiveDataRegistration(0, viewModelPhotos);


                    if (viewModelPhotos != null) {
                        // read viewModel.photos.getValue()
                        viewModelPhotosGetValue = viewModelPhotos.getValue();
                    }
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.status
                        viewModelStatus = viewModel.getStatus();
                    }
                    updateLiveDataRegistration(1, viewModelStatus);


                    if (viewModelStatus != null) {
                        // read viewModel.status.getValue()
                        viewModelStatusGetValue = viewModelStatus.getValue();
                    }
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.myString
                        viewModelMyString = viewModel.getMyString();
                    }
                    updateLiveDataRegistration(2, viewModelMyString);


                    if (viewModelMyString != null) {
                        // read viewModel.myString.getValue()
                        viewModelMyStringGetValue = viewModelMyString.getValue();
                    }


                    if (viewModelMyStringGetValue != null) {
                        // read viewModel.myString.getValue().toString()
                        viewModelMyStringToString = viewModelMyStringGetValue.toString();
                    }


                    // read @android:string/user_text
                    secondFragmentStringMessageAndroidStringUserTextViewModelMyStringToString = secondFragmentStringMessage.getResources().getString(R.string.user_text, viewModelMyStringToString);
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.myNumber
                        viewModelMyNumber = viewModel.getMyNumber();
                    }
                    updateLiveDataRegistration(3, viewModelMyNumber);


                    if (viewModelMyNumber != null) {
                        // read viewModel.myNumber.getValue()
                        viewModelMyNumberGetValue = viewModelMyNumber.getValue();
                    }


                    // read @android:string/user_number
                    secondFragmentIntMessageAndroidStringUserNumberViewModelMyNumber = secondFragmentIntMessage.getResources().getString(R.string.user_number, viewModelMyNumberGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.btnBackSecondFragment.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            ru.kostry.app.ui.adapter.BindingAdaptersKt.bindRecyclerView(this.photosGrid, viewModelPhotosGetValue);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.secondFragmentIntMessage, secondFragmentIntMessageAndroidStringUserNumberViewModelMyNumber);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.secondFragmentStringMessage, secondFragmentStringMessageAndroidStringUserTextViewModelMyStringToString);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            ru.kostry.app.ui.adapter.BindingAdaptersKt.bindStatus(this.statusImage, viewModelStatusGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // secondFragment
        ru.kostry.app.ui.view.SecondFragment secondFragment = mSecondFragment;
        // secondFragment != null
        boolean secondFragmentJavaLangObjectNull = false;



        secondFragmentJavaLangObjectNull = (secondFragment) != (null);
        if (secondFragmentJavaLangObjectNull) {


            secondFragment.buttonBackOnSecondFragment();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.photos
        flag 1 (0x2L): viewModel.status
        flag 2 (0x3L): viewModel.myString
        flag 3 (0x4L): viewModel.myNumber
        flag 4 (0x5L): secondFragment
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}