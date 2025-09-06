class ProfitAndLoss {
    public static void main(String[] args) {
        double costPrice = 1500;
        double sellingPrice = 2000;
        if (sellingPrice > costPrice) {
            System.out.println("Profit: " + (sellingPrice - costPrice));
        } else if (costPrice > sellingPrice) {
            System.out.println("Loss: " + (costPrice - sellingPrice));
        } else {
            System.out.println("No Profit No Loss");
        }
    }
}