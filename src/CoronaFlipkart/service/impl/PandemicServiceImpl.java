package CoronaFlipkart.service.impl;


import CoronaFlipkart.inmemory.PandemicInMemory;

public class PandemicServiceImpl implements CoronaFlipkart.service.PandemicInterface {

    PandemicInMemory pandemicInMemory;

    public PandemicServiceImpl(PandemicInMemory pandemicInMemory){
        this.pandemicInMemory = pandemicInMemory;
    }
    @Override
    public void getZone(String zoneId) {

        if(!pandemicInMemory.getZonalDetail().containsKey(zoneId) || pandemicInMemory.getZonalDetail().get(zoneId).size() == 0){
            System.out.println("GreenZone");
        } else if (pandemicInMemory.getZonalDetail().get(zoneId).size() <= 5) {
            System.out.println("OrangeZone");
        } else {
            System.out.println("RedZone");
        }
    }


}
