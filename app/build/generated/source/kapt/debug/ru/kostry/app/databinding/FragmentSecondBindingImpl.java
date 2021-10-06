package ru.kostry.app.databinding;
import ru.kostry.app.R;
import ru.kostry.app.BR;
import ru.kostry.app.ui.view.SecondFragment;
import ru.kostry.app.ui.viewmodel.MainViewModel;

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
        sViewsWithIds.put(R.id.btn_next_second_fragment, 4);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSecondBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentSecondBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            );
        this.btnBackSecondFragment.setTag(null);
        this.secondFragmentIntMessage.setTag(null);
        this.secondFragmentStringMessage.setTag(null);
        this.secondFrg.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new ru.kostry.app.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setSecondFragment((SecondFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSecondFragment(@Nullable SecondFragment SecondFragment) {
        this.mSecondFragment = SecondFragment;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.secondFragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable MainViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelMyString((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelMyNumber((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelMyString(androidx.lifecycle.LiveData<java.lang.String> ViewModelMyString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMyNumber(androidx.lifecycle.LiveData<java.lang.Integer> ViewModelMyNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        SecondFragment secondFragment = mSecondFragment;
        java.lang.String viewModelMyStringToString = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelMyString = null;
        java.lang.String secondFragmentStringMessageAndroidStringUserTextViewModelMyStringToString = null;
        java.lang.Integer viewModelMyNumberGetValue = null;
        java.lang.String viewModelMyStringGetValue = null;
        MainViewModel viewModel = mViewModel;
        java.lang.String secondFragmentIntMessageAndroidStringUserNumberViewModelMyNumber = null;
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelMyNumber = null;

        if ((dirtyFlags & 0x1bL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.myString
                        viewModelMyString = viewModel.getMyString();
                    }
                    updateLiveDataRegistration(0, viewModelMyString);


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
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.myNumber
                        viewModelMyNumber = viewModel.getMyNumber();
                    }
                    updateLiveDataRegistration(1, viewModelMyNumber);


                    if (viewModelMyNumber != null) {
                        // read viewModel.myNumber.getValue()
                        viewModelMyNumberGetValue = viewModelMyNumber.getValue();
                    }


                    // read @android:string/user_number
                    secondFragmentIntMessageAndroidStringUserNumberViewModelMyNumber = secondFragmentIntMessage.getResources().getString(R.string.user_number, viewModelMyNumberGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.btnBackSecondFragment.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.secondFragmentIntMessage, secondFragmentIntMessageAndroidStringUserNumberViewModelMyNumber);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.secondFragmentStringMessage, secondFragmentStringMessageAndroidStringUserTextViewModelMyStringToString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // secondFragment
        SecondFragment secondFragment = mSecondFragment;
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
        flag 0 (0x1L): viewModel.myString
        flag 1 (0x2L): viewModel.myNumber
        flag 2 (0x3L): secondFragment
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}