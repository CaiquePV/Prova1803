class Obra(var nome: String){
    private val usoinsumos = arrayListOf<UsoInsumos>()
    private val usoEquipamento = arrayListOf<UsoEquipamentos>()
    private val usoMaodeObra = arrayListOf<UsoMaodeObra>()


        //Função uso do Insumo
    fun usaInsumo(insumosUtilizados: UsoInsumos){
        this.usoinsumos.add(insumosUtilizados)
    }

    //Função uso do Equipamento
    fun usaEquipamento(equipamento: UsoEquipamentos){
        this.usoEquipamento.add(equipamento)
    }

    //Função Mão de Obra dos Funcionários
    fun temTrabalhadores(trabalhador: UsoMaodeObra){
        this.usoMaodeObra.add(trabalhador)
    }

    //Função valor total dos gastos com Insumos
    fun vlrTotalInsumos(): Int{
        var valorTotal: Int = 0
        for (insumo in usoinsumos){
            valorTotal += insumo.insumo.preco * insumo.quantidade
        }
        return valorTotal
    }

    //Função valor total dos gastos com Equipamentos
    fun vlrTotalEquipamento(): Int{
        var valorTotal: Int = 0
        for (equipamento in usoEquipamento){
            valorTotal += equipamento.horas * equipamento.equipamento.custo
        }
        return valorTotal
    }

    //Função valor total dos gastos com Mão de Obra
    fun vlrTotalMaoDeObra(): Int{
        var valorTotal: Int = 0
        for (usoMaodeObra in usoMaodeObra)  {
            valorTotal += usoMaodeObra.maodeobra.reaisHora * usoMaodeObra.horasTrabalho


        }
        return valorTotal
    }


    //Função valor gastos total com a Obra
    fun totalObra(): Int{
        return vlrTotalInsumos() + vlrTotalMaoDeObra() + vlrTotalEquipamento()
    }
}