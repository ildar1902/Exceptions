package driver;

import transport.Transport;

public class Driver<T extends Transport> {
    private final String name;
    private boolean haveDriverLicense;
    private int experience;
    private String category;

    public Driver(String name, boolean haveDriverLicense, int experience, String category) {
        if (StringUtils.isNotEmpty(name)) {
            this.name = name;
        } else {
            this.name = "Ivan";
        }
        this.haveDriverLicense = haveDriverLicense;
        if (experience > 0) {
            this.experience = experience;
        } else {
            this.experience = Math.abs(experience);
        }
        setCategory(category);
    }


    public void printInfo(T transport) {
        System.out.println("водитель " + getName() + " управляет "
                + transport.getBrand() + " и будет участвовать в заезде!");
    }
    public String getName() {
        return name;
    }

    public boolean isHaveDriverLicense() {
        return haveDriverLicense;
    }

    public void setHaveDriverLicense(boolean haveDriverLicense) {
        this.haveDriverLicense = haveDriverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        if (StringUtils.isNullOrEmpty(category)) {
            throw new IllegalArgumentException("Необходимо указать категорию прав! ");
        }
        this.category = category;
    }
}
