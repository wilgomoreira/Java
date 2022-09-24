package site.wilgo.maratonajava.javacore.ZZGBuilder.dominio;

public class ReportDto {
    private String aircraftName;
    private Country country;
    private String currencyName;
    private String personName;


    public static final class ReportDtoBuilder {
        private String aircraftName;
        private Country country;
        private String currencyName;
        private String personName;

        private ReportDtoBuilder() {
        }

        public static ReportDtoBuilder builder() {
            return new ReportDtoBuilder();
        }

        public ReportDtoBuilder aircraftName(String aircraftName) {
            this.aircraftName = aircraftName;
            return this;
        }

        public ReportDtoBuilder country(Country country) {
            this.country = country;
            return this;
        }

        public ReportDtoBuilder currencyName(String currencyName) {
            this.currencyName = currencyName;
            return this;
        }

        public ReportDtoBuilder personName(String personName) {
            this.personName = personName;
            return this;
        }

        public ReportDto build() {
            ReportDto reportDto = new ReportDto();
            reportDto.currencyName = this.currencyName;
            reportDto.aircraftName = this.aircraftName;
            reportDto.country = this.country;
            reportDto.personName = this.personName;
            return reportDto;
        }
    }

    @Override
    public String toString() {
        return "ReportDto{" +
                "aircraftName='" + aircraftName + '\'' +
                ", country=" + country +
                ", currencyName=" + currencyName +
                ", personName='" + personName + '\'' +
                '}';
    }
}
