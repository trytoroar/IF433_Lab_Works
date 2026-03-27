package oop_133290_VijieAnnisaDzatilIzzah.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("⚔️ Monster muncul: ${event.monsterName}! Bersiap bertarung!")
        }

        is BattleState.LootDropped -> {
            val (name, _, rarity) = event.item
            println("🎁 Loot didapat: $name (Rarity: $rarity)")
        }

        is BattleState.GameOver -> {
            println("💀 Game Over! Alasan: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("🛡️ Kamu berada di Safe Zone. Aman untuk beristirahat.")
        }
    }
}