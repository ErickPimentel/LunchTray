package com.example.lunchtray.databinding;
import com.example.lunchtray.R;
import com.example.lunchtray.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAccompanimentMenuBindingImpl extends FragmentAccompanimentMenuBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.accompaniment_options, 10);
        sViewsWithIds.put(R.id.divider, 11);
        sViewsWithIds.put(R.id.subtotal, 12);
        sViewsWithIds.put(R.id.cancel_button, 13);
        sViewsWithIds.put(R.id.next_button, 14);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAccompanimentMenuBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentAccompanimentMenuBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RadioGroup) bindings[10]
            , (android.widget.RadioButton) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.RadioButton) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (android.widget.Button) bindings[13]
            , (android.view.View) bindings[11]
            , (android.widget.Button) bindings[14]
            , (android.widget.RadioButton) bindings[7]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[12]
            );
        this.berries.setTag(null);
        this.berriesDescription.setTag(null);
        this.berriesPrice.setTag(null);
        this.bread.setTag(null);
        this.breadDescription.setTag(null);
        this.breadPrice.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.pickles.setTag(null);
        this.picklesDescription.setTag(null);
        this.picklesPrice.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.example.lunchtray.model.OrderViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.lunchtray.model.OrderViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
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
        com.example.lunchtray.model.MenuItem viewModelMenuItemsBread = null;
        java.lang.String viewModelMenuItemsBerriesDescription = null;
        java.lang.String viewModelMenuItemsPicklesGetFormattedPrice = null;
        java.util.Map<java.lang.String,com.example.lunchtray.model.MenuItem> viewModelMenuItems = null;
        java.lang.String viewModelMenuItemsBreadName = null;
        java.lang.String viewModelMenuItemsBreadDescription = null;
        java.lang.String viewModelMenuItemsBerriesGetFormattedPrice = null;
        java.lang.String viewModelMenuItemsBreadGetFormattedPrice = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsPickles = null;
        com.example.lunchtray.model.MenuItem viewModelMenuItemsBerries = null;
        java.lang.String viewModelMenuItemsBerriesName = null;
        com.example.lunchtray.model.OrderViewModel viewModel = mViewModel;
        java.lang.String viewModelMenuItemsPicklesName = null;
        java.lang.String viewModelMenuItemsPicklesDescription = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel.menuItems
                    viewModelMenuItems = viewModel.getMenuItems();
                }


                if (viewModelMenuItems != null) {
                    // read viewModel.menuItems["bread"]
                    viewModelMenuItemsBread = viewModelMenuItems.get("bread");
                    // read viewModel.menuItems["pickles"]
                    viewModelMenuItemsPickles = viewModelMenuItems.get("pickles");
                    // read viewModel.menuItems["berries"]
                    viewModelMenuItemsBerries = viewModelMenuItems.get("berries");
                }


                if (viewModelMenuItemsBread != null) {
                    // read viewModel.menuItems["bread"].name
                    viewModelMenuItemsBreadName = viewModelMenuItemsBread.getName();
                    // read viewModel.menuItems["bread"].description
                    viewModelMenuItemsBreadDescription = viewModelMenuItemsBread.getDescription();
                    // read viewModel.menuItems["bread"].getFormattedPrice()
                    viewModelMenuItemsBreadGetFormattedPrice = viewModelMenuItemsBread.getFormattedPrice();
                }
                if (viewModelMenuItemsPickles != null) {
                    // read viewModel.menuItems["pickles"].getFormattedPrice()
                    viewModelMenuItemsPicklesGetFormattedPrice = viewModelMenuItemsPickles.getFormattedPrice();
                    // read viewModel.menuItems["pickles"].name
                    viewModelMenuItemsPicklesName = viewModelMenuItemsPickles.getName();
                    // read viewModel.menuItems["pickles"].description
                    viewModelMenuItemsPicklesDescription = viewModelMenuItemsPickles.getDescription();
                }
                if (viewModelMenuItemsBerries != null) {
                    // read viewModel.menuItems["berries"].description
                    viewModelMenuItemsBerriesDescription = viewModelMenuItemsBerries.getDescription();
                    // read viewModel.menuItems["berries"].getFormattedPrice()
                    viewModelMenuItemsBerriesGetFormattedPrice = viewModelMenuItemsBerries.getFormattedPrice();
                    // read viewModel.menuItems["berries"].name
                    viewModelMenuItemsBerriesName = viewModelMenuItemsBerries.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.berries, viewModelMenuItemsBerriesName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.berriesDescription, viewModelMenuItemsBerriesDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.berriesPrice, viewModelMenuItemsBerriesGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.bread, viewModelMenuItemsBreadName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.breadDescription, viewModelMenuItemsBreadDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.breadPrice, viewModelMenuItemsBreadGetFormattedPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.pickles, viewModelMenuItemsPicklesName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.picklesDescription, viewModelMenuItemsPicklesDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.picklesPrice, viewModelMenuItemsPicklesGetFormattedPrice);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}