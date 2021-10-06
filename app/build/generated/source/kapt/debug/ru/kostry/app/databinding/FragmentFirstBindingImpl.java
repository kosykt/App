package ru.kostry.app.databinding;
import ru.kostry.app.R;
import ru.kostry.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentFirstBindingImpl extends FragmentFirstBinding implements ru.kostry.app.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.first_fragment_edit_text_field, 4);
        sViewsWithIds.put(R.id.first_fragment_number_input_edit_text, 5);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFirstBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentFirstBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[2]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (com.google.android.material.textfield.TextInputEditText) bindings[5]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            );
        this.btnBackFirstFragment.setTag(null);
        this.btnNextFirstFragment.setTag(null);
        this.firstFragmentMessage.setTag(null);
        this.firstFrg.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new ru.kostry.app.generated.callback.OnClickListener(this, 2);
        mCallback2 = new ru.kostry.app.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.firstFragment == variableId) {
            setFirstFragment((ru.kostry.app.ui.view.FirstFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((ru.kostry.app.ui.viewmodel.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFirstFragment(@Nullable ru.kostry.app.ui.view.FirstFragment FirstFragment) {
        this.mFirstFragment = FirstFragment;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.firstFragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable ru.kostry.app.ui.viewmodel.MainViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelMyString((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
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

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        ru.kostry.app.ui.view.FirstFragment firstFragment = mFirstFragment;
        java.lang.String viewModelMyStringToString = null;
        java.lang.String firstFragmentMessageAndroidStringUserTextViewModelMyStringToString = null;
        androidx.lifecycle.LiveData<java.lang.String> viewModelMyString = null;
        java.lang.String viewModelMyStringGetValue = null;
        ru.kostry.app.ui.viewmodel.MainViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xdL) != 0) {



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
                firstFragmentMessageAndroidStringUserTextViewModelMyStringToString = firstFragmentMessage.getResources().getString(R.string.user_text, viewModelMyStringToString);
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.btnBackFirstFragment.setOnClickListener(mCallback3);
            this.btnNextFirstFragment.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.firstFragmentMessage, firstFragmentMessageAndroidStringUserTextViewModelMyStringToString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // firstFragment
                ru.kostry.app.ui.view.FirstFragment firstFragment = mFirstFragment;
                // firstFragment != null
                boolean firstFragmentJavaLangObjectNull = false;



                firstFragmentJavaLangObjectNull = (firstFragment) != (null);
                if (firstFragmentJavaLangObjectNull) {


                    firstFragment.buttonBackOnFirstFragment();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // firstFragment
                ru.kostry.app.ui.view.FirstFragment firstFragment = mFirstFragment;
                // firstFragment != null
                boolean firstFragmentJavaLangObjectNull = false;



                firstFragmentJavaLangObjectNull = (firstFragment) != (null);
                if (firstFragmentJavaLangObjectNull) {


                    firstFragment.buttonNextOnFirstFragment();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.myString
        flag 1 (0x2L): firstFragment
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}