package icarus.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


@Entity
@Table(name = "imovel")

public class Imoveis {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
		
	@Column(name = "nome", nullable = false)
	private String name; //nome
	
	@Column(name = "rua", nullable = false)
	private String street; //endereço
	
	@Column(name="descricao")
	@Lob
	private String description;//descrição
	
	@Column(name = "cidade", nullable = false)
	private String city; //cidade
	
	@Column(name = "area", nullable = false)
	private String area; //área
	
	@Column(name="bairro", nullable=false)
	private String district;
	
	@Column(name="cep", nullable=false)
	private String cep;
	
	@Column(name = "vigilancia")
	private String surveillance; //vigilancia
	
	@Column(name = "estacionamento")
	private String parkinglots; //estacionamento
	
	@Column(name="numero")
	private int number;
	
	@Column(name = "ano_construcao")
	private int construction_year; //ano construção
	
	@Column(name = "preco_aluguel", nullable = false)
	private int rent_price; //preço aluguel
	
	@Column(name = "preco_m2", nullable = false)
	private int price_perm2; //preço m2
	
	@Column(name = "banheiros", nullable = false)
	private int bathrooms; //banheiros
	
	
	
	//getters and setters
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public int getConstruction_year() {
		return construction_year;
	}
	public void setConstruction_year(int construction_year) {
		this.construction_year = construction_year;
	}
	public int getRent_price() {
		return rent_price;
	}
	public void setRent_price(int rent_price) {
		this.rent_price = rent_price;
	}
	public int getPrice_perm2() {
		return price_perm2;
	}
	public void setPrice_perm2(int price_perm2) {
		this.price_perm2 = price_perm2;
	}
	public int getBathrooms() {
		return bathrooms;
	}
	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSurveillance() {
		return surveillance;
	}
	public void setSurveillance(String surveillance) {
		this.surveillance = surveillance;
	}
	
	public String getParkinglots() {
		return parkinglots;
	}
	public void setParkinglots(String parkinglots) {
		this.parkinglots = parkinglots;
	}
	
	
}
