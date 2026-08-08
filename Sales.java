public abstract class Sales implements ISales {
    String ShoeBrand;
    int BrandSales;

    public Sales(SalesModel model) {
        this.ShoeBrand = model.ShoeBrand;
        this.BrandSales = model.BrandSales;
    }
    @Override
    public String getShoeBrand() {
        return ShoeBrand;
    }

    @Override
    public int getBrandSales() {
        return BrandSales;
    }

    public abstract void Print();
}
