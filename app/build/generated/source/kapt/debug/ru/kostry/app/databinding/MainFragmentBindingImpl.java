package ru.kostry.app.databinding;
import ru.kostry.app.R;
import ru.kostry.app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MainFragmentBindingImpl extends MainFragmentBinding implements ru.kostry.app.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.main_edit_text_field, 2);
        sViewsWithIds.put(R.id.main_text_input_edit_text, 3);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MainFragmentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private MainFragmentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            );
        this.btnMainFragment.setTag(null);
        this.mainFrg.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new ru.kostry.app.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.mainFragment == variableId) {
            setMainFragment((ru.kostry.app.ui.view.MainFragment) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((ru.kostry.app.ui.viewmodel.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMainFragment(@Nullable ru.kostry.app.ui.view.MainFragment MainFragment) {
        this.mMainFragment = MainFragment;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.mainFragment);
        super.requestRebind();
    }
    public void setViewModel(@Nullable ru.kostry.app.ui.viewmodel.MainViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        ru.kostry.app.ui.view.MainFragment mainFragment = mMainFragment;
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.btnMainFragment.setOnClickListener(mCallback5);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // mainFragment != null
        boolean mainFragmentJavaLangObjectNull = false;
        // mainFragment
        ru.kostry.app.ui.view.MainFragment mainFragment = mMainFragment;



        mainFragmentJavaLangObjectNull = (mainFragment) != (null);
        if (mainFragmentJavaLangObjectNull) {


            mainFragment.buttonNextOnMainFragment();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mainFragment
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}