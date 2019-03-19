fun main() {

    var obraConstrutora = Obra("Residencial São João")

    //Instância e uso dos Insumos
    var pedregulho = Insumos("Pedregulho",22)
    var cimento = Insumos("Cimento",35)
    var areia = Insumos("Areia",25)
    var cal = Insumos("Cal",12)
    var consumoPedregulho = UsoInsumos(pedregulho,40)
    var consumoAreia = UsoInsumos(areia,30)
    var consumoCimento = UsoInsumos(cimento,50)
    var consumoCal = UsoInsumos(cal,32)

    //Instância e uso dos Equipamentos
    var gerador = Equipamentos("Gerador", 85)
    var andaime = Equipamentos("Andaime", 15)
    var betoneira = Equipamentos("Betoneira",30)
    var trator = Equipamentos("Trator",100)
    var trabalhoGerador = UsoEquipamentos(gerador, 10)
    var trabalhoAndaime = UsoEquipamentos(andaime, 10)
    var trabalhoBetoneira = UsoEquipamentos(betoneira,10)
    var trabalhoTrator = UsoEquipamentos(trator,2)

    //Instância dos Funcionários/Mão de Obra
    var engenheiro = MaodeObra("Engenheiro",5)
    var arquiteto = MaodeObra("Arquiteto",5)
    var mestreobra = MaodeObra("Mestre de Obras",10)
    var pedreiro = MaodeObra("Pedreiro",10)
    var servente1 = MaodeObra("Servente 1",8)
    var servente2 = MaodeObra("Servente 2",8)

    var trabalhoEngenheiro = UsoMaodeObra(engenheiro, 10)
    var trabalhoArquiteto = UsoMaodeObra(arquiteto, 10)
    var trabalhoMestreObra = UsoMaodeObra(mestreobra, 10)
    var trabalhoPedreiro = UsoMaodeObra(pedreiro, 10)
    var trabalhoServente1 = UsoMaodeObra(servente1, 10)
    var trabalhoServente2 = UsoMaodeObra(servente2, 10)


    //Atribuições
    obraConstrutora.usaInsumo(consumoPedregulho)
    obraConstrutora.usaInsumo(consumoAreia)
    obraConstrutora.usaInsumo(consumoCimento)
    obraConstrutora.usaInsumo(consumoCal)

    obraConstrutora.usaEquipamento(trabalhoGerador)
    obraConstrutora.usaEquipamento(trabalhoAndaime)
    obraConstrutora.usaEquipamento(trabalhoBetoneira)
    obraConstrutora.usaEquipamento(trabalhoTrator)

    obraConstrutora.temTrabalhadores(trabalhoEngenheiro)
    obraConstrutora.temTrabalhadores(trabalhoArquiteto)
    obraConstrutora.temTrabalhadores(trabalhoMestreObra)
    obraConstrutora.temTrabalhadores(trabalhoPedreiro)
    obraConstrutora.temTrabalhadores(trabalhoServente1)
    obraConstrutora.temTrabalhadores(trabalhoServente2)

    //Impressão dos Resultados
    println("Nome da obra: ${obraConstrutora.nome}")

    println("------------------------------------------------------------------------------")

    println("Na obra ${obraConstrutora.nome} foram gastos com Insumos ${obraConstrutora.vlrTotalInsumos()} reais")

    println("Na obra ${obraConstrutora.nome} foram gastos com Equipamentos ${obraConstrutora.vlrTotalEquipamento()} reais")

    println("Na obra ${obraConstrutora.nome} foram gastos com Mão de Obra ${obraConstrutora.vlrTotalMaoDeObra()} reais")

    println("------------------------------------------------------------------------------")

    println("Na obra ${obraConstrutora.nome} foram gastos no total ${obraConstrutora.totalObra()} reais")
}