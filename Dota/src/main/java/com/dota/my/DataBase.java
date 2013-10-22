package com.dota.my;

import java.util.Vector;

public class DataBase {
    public Vector<Hero> heroes;

    public DataBase() {
        heroes = new Vector<Hero>();

        heroes.add(new Hero("Earthshaker",
                R.drawable.earthshaker_full,
                R.drawable.earthshaker_fissure_hp1,
                R.drawable.earthshaker_enchant_totem_hp1,
                R.drawable.earthshaker_aftershock_hp1,
                R.drawable.earthshaker_echo_slam_hp1));

        heroes.add(new Hero("Sven",
                R.drawable.sven_full,
                R.drawable.sven_storm_bolt_hp1,
                R.drawable.sven_great_cleave_hp1,
                R.drawable.sven_warcry_hp1,
                R.drawable.sven_gods_strength_hp1));

        heroes.add(new Hero("Tiny",
                R.drawable.tiny_full,
                R.drawable.tiny_avalanche_hp1,
                R.drawable.tiny_toss_hp1,
                R.drawable.tiny_craggy_exterior_hp1,
                R.drawable.tiny_grow_hp1));

        heroes.add(new Hero("Kunkka",
                R.drawable.kunkka_full,
                R.drawable.kunkka_torrent_hp1,
                R.drawable.kunkka_tidebringer_hp1,
                R.drawable.kunkka_x_marks_the_spot_hp1,
                R.drawable.kunkka_ghostship_hp1));

        heroes.add(new Hero("Beastmaster",
                R.drawable.beastmaster_full,
                R.drawable.beastmaster_wild_axes_hp1,
                R.drawable.beastmaster_call_of_the_wild_hp1,
                R.drawable.beastmaster_inner_beast_hp1,
                R.drawable.beastmaster_primal_roar_hp1));

        heroes.add(new Hero("Dragon Knight",
                R.drawable.dragon_knight_full,
                R.drawable.dragon_knight_breathe_fire_hp1,
                R.drawable.dragon_knight_dragon_tail_hp1,
                R.drawable.dragon_knight_dragon_blood_hp1,
                R.drawable.dragon_knight_elder_dragon_form_hp1));

        heroes.add(new Hero("Clockwerk",
                R.drawable.rattletrap_full,
                R.drawable.rattletrap_battery_assault_hp1,
                R.drawable.rattletrap_power_cogs_hp1,
                R.drawable.rattletrap_rocket_flare_hp1,
                R.drawable.rattletrap_hookshot_hp1));

        heroes.add(new Hero("Omni Knight",
                R.drawable.omniknight_full,
                R.drawable.omniknight_purification_hp1,
                R.drawable.omniknight_repel_hp1,
                R.drawable.omniknight_degen_aura_hp1,
                R.drawable.omniknight_guardian_angel_hp1));

        heroes.add(new Hero("Huskar",
                R.drawable.huskar_full,
                R.drawable.huskar_inner_vitality_hp1,
                R.drawable.huskar_burning_spear_hp1,
                R.drawable.huskar_berserkers_blood_hp1,
                R.drawable.huskar_life_break_hp1));

        heroes.add(new Hero("Alchemist",
                R.drawable.alchemist_full,
                R.drawable.alchemist_acid_spray_hp1,
                R.drawable.alchemist_unstable_concoction_hp1,
                R.drawable.alchemist_goblins_greed_hp1,
                R.drawable.alchemist_chemical_rage_hp1));

        heroes.add(new Hero("Brewmaster",
                R.drawable.brewmaster_full,
                R.drawable.brewmaster_thunder_clap_hp1,
                R.drawable.brewmaster_drunken_haze_hp1,
                R.drawable.brewmaster_drunken_brawler_hp1,
                R.drawable.brewmaster_primal_split_hp1));

        heroes.add(new Hero("Treant Protector",
                R.drawable.treant_full,
                R.drawable.treant_natures_guise_hp1,
                R.drawable.treant_leech_seed_hp1,
                R.drawable.treant_living_armor_hp1,
                R.drawable.treant_overgrowth_hp1));

        heroes.add(new Hero("Io",
                R.drawable.wisp_full,
                R.drawable.wisp_tether_hp1,
                R.drawable.wisp_spirits_hp1,
                R.drawable.wisp_overcharge_hp1,
                R.drawable.wisp_relocate_hp1));

        heroes.add(new Hero("Centaur Warrunner",
                R.drawable.centaur_full,
                R.drawable.centaur_hoof_stomp_hp1,
                R.drawable.centaur_double_edge_hp1,
                R.drawable.centaur_return_hp1,
                R.drawable.centaur_stampede_hp1));

        heroes.add(new Hero("Timbersaw",
                R.drawable.shredder_full,
                R.drawable.shredder_whirling_death_hp1,
                R.drawable.shredder_timber_chain_hp1,
                R.drawable.shredder_reactive_armor_hp1,
                R.drawable.shredder_chakram_hp1));

        heroes.add(new Hero("Bristleback",
                R.drawable.bristleback_full,
                R.drawable.bristleback_viscous_nasal_goo_hp1,
                R.drawable.bristleback_quill_spray_hp1,
                R.drawable.bristleback_bristleback_hp1,
                R.drawable.bristleback_warpath_hp1));

        heroes.add(new Hero("Tuskar",
                R.drawable.tusk_full,
                R.drawable.tusk_ice_shards_hp1,
                R.drawable.tusk_snowball_hp1,
                R.drawable.tusk_frozen_sigil_hp1,
                R.drawable.tusk_walrus_punch_hp1));

        heroes.add(new Hero("Elder Titan",
                R.drawable.elder_titan_full,
                R.drawable.elder_titan_echo_stomp_hp1,
                R.drawable.elder_titan_ancestral_spirit_hp1,
                R.drawable.elder_titan_natural_order_hp1,
                R.drawable.elder_titan_earth_splitter_hp1));

        heroes.add(new Hero("Axe",
                R.drawable.axe_full,
                R.drawable.axe_berserkers_call_hp1,
                R.drawable.axe_battle_hunger_hp1,
                R.drawable.axe_counter_helix_hp1,
                R.drawable.axe_culling_blade_hp1));

        heroes.add(new Hero("Pudge",
                R.drawable.pudge_full,
                R.drawable.pudge_meat_hook_hp1,
                R.drawable.pudge_rot_hp1,
                R.drawable.pudge_flesh_heap_hp1,
                R.drawable.pudge_dismember_hp1));

        heroes.add(new Hero("Sand King",
                R.drawable.sand_king_full,
                R.drawable.sandking_burrowstrike_hp1,
                R.drawable.sandking_sand_storm_hp1,
                R.drawable.sandking_caustic_finale_hp1,
                R.drawable.sandking_epicenter_hp1));

        heroes.add(new Hero("Slardar",
                R.drawable.slardar_full,
                R.drawable.slardar_sprint_hp1,
                R.drawable.slardar_slithereen_crush_hp1,
                R.drawable.slardar_bash_hp1,
                R.drawable.slardar_amplify_damage_hp1));

        heroes.add(new Hero("Tidehunter",
                R.drawable.tidehunter_full,
                R.drawable.tidehunter_gush_hp1,
                R.drawable.tidehunter_kraken_shell_hp1,
                R.drawable.tidehunter_anchor_smash_hp1,
                R.drawable.tidehunter_ravage_hp1));

        heroes.add(new Hero("Skeleton King",
                R.drawable.skeleton_king_full,
                R.drawable.skeleton_king_hellfire_blast_hp1,
                R.drawable.skeleton_king_vampiric_aura_hp1,
                R.drawable.skeleton_king_mortal_strike_hp1,
                R.drawable.skeleton_king_reincarnation_hp1));

        heroes.add(new Hero("Lifestealer",
                R.drawable.life_stealer_full,
                R.drawable.life_stealer_rage_hp1,
                R.drawable.life_stealer_feast_hp1,
                R.drawable.life_stealer_open_wounds_hp1,
                R.drawable.life_stealer_infest_hp1));

        heroes.add(new Hero("Night Stalker",
                R.drawable.night_stalker_full,
                R.drawable.night_stalker_void_hp1,
                R.drawable.night_stalker_crippling_fear_hp1,
                R.drawable.night_stalker_hunter_in_the_night_hp1,
                R.drawable.night_stalker_darkness_hp1));

        heroes.add(new Hero("Doom",
                R.drawable.doom_bringer_full,
                R.drawable.doom_bringer_devour_hp1,
                R.drawable.doom_bringer_scorched_earth_hp1,
                R.drawable.doom_bringer_lvl_death_hp1,
                R.drawable.doom_bringer_doom_hp1));

        heroes.add(new Hero("Spirit Breaker",
                R.drawable.spirit_breaker_full,
                R.drawable.spirit_breaker_charge_of_darkness_hp1,
                R.drawable.spirit_breaker_empowering_haste_hp1,
                R.drawable.spirit_breaker_greater_bash_hp1,
                R.drawable.spirit_breaker_nether_strike_hp1));

        heroes.add(new Hero("Lycanthrope",
                R.drawable.lycan_full,
                R.drawable.lycan_summon_wolves_hp1,
                R.drawable.lycan_howl_hp1,
                R.drawable.lycan_feral_impulse_hp1,
                R.drawable.lycan_shapeshift_hp1));

        heroes.add(new Hero("Chaos Knight",
                R.drawable.chaos_knight_full,
                R.drawable.chaos_knight_chaos_bolt_hp1,
                R.drawable.chaos_knight_reality_rift_hp1,
                R.drawable.chaos_knight_chaos_strike_hp1,
                R.drawable.chaos_knight_phantasm_hp1));

        heroes.add(new Hero("Undying",
                R.drawable.undying_full,
                R.drawable.undying_decay_hp1,
                R.drawable.undying_soul_rip_hp1,
                R.drawable.undying_tombstone_hp1,
                R.drawable.undying_flesh_golem_hp1));

        heroes.add(new Hero("Magnus",
                R.drawable.magnataur_full,
                R.drawable.magnataur_shockwave_hp1,
                R.drawable.magnataur_empower_hp1,
                R.drawable.magnataur_skewer_hp1,
                R.drawable.magnataur_reverse_polarity_hp1));

        heroes.add(new Hero("Abaddon",
                R.drawable.abaddon_full,
                R.drawable.abaddon_death_coil_hp1,
                R.drawable.abaddon_aphotic_shield_hp1,
                R.drawable.abaddon_frostmourne_hp1,
                R.drawable.abaddon_borrowed_time_hp1));

        heroes.add(new Hero("Anti Mage",
                R.drawable.antimage_full,
                R.drawable.antimage_mana_break_hp1,
                R.drawable.antimage_blink_hp1,
                R.drawable.antimage_spell_shield_hp1,
                R.drawable.antimage_mana_void_hp1));

        heroes.add(new Hero("Drow Ranger",
                R.drawable.drow_ranger_full,
                R.drawable.drow_ranger_frost_arrows_hp1,
                R.drawable.drow_ranger_silence_hp1,
                R.drawable.drow_ranger_trueshot_hp1,
                R.drawable.drow_ranger_marksmanship_hp1));

        heroes.add(new Hero("Juggernaut",
                R.drawable.juggernaut_full,
                R.drawable.juggernaut_blade_fury_hp1,
                R.drawable.juggernaut_healing_ward_hp1,
                R.drawable.juggernaut_blade_dance_hp1,
                R.drawable.juggernaut_omni_slash_hp1));

        heroes.add(new Hero("Mirana",
                R.drawable.mirana_full,
                R.drawable.mirana_starfall_hp1,
                R.drawable.mirana_arrow_hp1,
                R.drawable.mirana_leap_hp1,
                R.drawable.mirana_invis_hp1));

        heroes.add(new Hero("Morphling",
                R.drawable.morphling_full,
                R.drawable.morphling_waveform_hp1,
                R.drawable.morphling_adaptive_strike_hp1,
                R.drawable.morphling_morph_agi_hp1,
                R.drawable.morphling_replicate_hp1));

        heroes.add(new Hero("Phantom Lancer",
                R.drawable.phantom_lancer_full,
                R.drawable.phantom_lancer_spirit_lance_hp1,
                R.drawable.phantom_lancer_doppelwalk_hp1,
                R.drawable.phantom_lancer_juxtapose_hp1,
                R.drawable.phantom_lancer_phantom_edge_hp1));

        heroes.add(new Hero("Vengeful Spirit",
                R.drawable.vengefulspirit_full,
                R.drawable.vengefulspirit_magic_missile_hp1,
                R.drawable.vengefulspirit_wave_of_terror_hp1,
                R.drawable.vengefulspirit_wave_of_terror_hp1,
                R.drawable.vengefulspirit_nether_swap_hp1));

        heroes.add(new Hero("Riki",
                R.drawable.riki_full,
                R.drawable.riki_smoke_screen_hp1,
                R.drawable.riki_blink_strike_hp1,
                R.drawable.riki_backstab_hp1,
                R.drawable.riki_permanent_invisibility_hp1));

        heroes.add(new Hero("Sniper",
                R.drawable.sniper_full,
                R.drawable.sniper_shrapnel_hp1,
                R.drawable.sniper_headshot_hp1,
                R.drawable.sniper_take_aim_hp1,
                R.drawable.sniper_assassinate_hp1));

        heroes.add(new Hero("Templar Assassin",
                R.drawable.templar_assassin_full,
                R.drawable.templar_assassin_refraction_hp1,
                R.drawable.templar_assassin_meld_hp1,
                R.drawable.templar_assassin_psi_blades_hp1,
                R.drawable.templar_assassin_psionic_trap_hp1));

        heroes.add(new Hero("Luna",
                R.drawable.luna_full,
                R.drawable.luna_lucent_beam_hp1,
                R.drawable.luna_moon_glaive_hp1,
                R.drawable.luna_lunar_blessing_hp1,
                R.drawable.luna_eclipse_hp1));

        heroes.add(new Hero("Bounty Hunter",
                R.drawable.bounty_hunter_full,
                R.drawable.bounty_hunter_shuriken_toss_hp1,
                R.drawable.bounty_hunter_jinada_hp1,
                R.drawable.bounty_hunter_wind_walk_hp1,
                R.drawable.bounty_hunter_track_hp1));

        heroes.add(new Hero("Ursa",
                R.drawable.ursa_full,
                R.drawable.ursa_earthshock_hp1,
                R.drawable.ursa_overpower_hp1,
                R.drawable.ursa_fury_swipes_hp1,
                R.drawable.ursa_enrage_hp1));

        heroes.add(new Hero("Gyrocopter",
                R.drawable.gyrocopter_full,
                R.drawable.gyrocopter_rocket_barrage_hp1,
                R.drawable.gyrocopter_homing_missile_hp1,
                R.drawable.gyrocopter_flak_cannon_hp1,
                R.drawable.gyrocopter_call_down_hp1));

        heroes.add(new Hero("Lone Druid",
                R.drawable.lone_druid_full,
                R.drawable.lone_druid_spirit_bear_hp1,
                R.drawable.lone_druid_rabid_hp1,
                R.drawable.lone_druid_synergy_hp1,
                R.drawable.lone_druid_true_form_hp1));

        heroes.add(new Hero("Naga Siren",
                R.drawable.naga_siren_full,
                R.drawable.naga_siren_mirror_image_hp1,
                R.drawable.naga_siren_ensnare_hp1,
                R.drawable.naga_siren_rip_tide_hp1,
                R.drawable.naga_siren_song_of_the_siren_hp1));

        heroes.add(new Hero("Troll Warlord",
                R.drawable.troll_warlord_full,
                R.drawable.troll_warlord_berserkers_rage_hp1,
                R.drawable.troll_warlord_whirling_axes_ranged_hp1,
                R.drawable.troll_warlord_fervor_hp1,
                R.drawable.troll_warlord_battle_trance_hp1));

        heroes.add(new Hero("Bloodseeker",
                R.drawable.bloodseeker_full,
                R.drawable.bloodseeker_bloodrage_hp1,
                R.drawable.bloodseeker_blood_bath_hp1,
                R.drawable.bloodseeker_thirst_hp1,
                R.drawable.bloodseeker_rupture_hp1));

        heroes.add(new Hero("Shadow Fiend",
                R.drawable.nevermore_full,
                R.drawable.nevermore_shadowraze1_hp1,
                R.drawable.nevermore_necromastery_hp1,
                R.drawable.nevermore_dark_lord_hp1,
                R.drawable.nevermore_requiem_hp1));

        heroes.add(new Hero("Razor",
                R.drawable.razor_full,
                R.drawable.razor_plasma_field_hp1,
                R.drawable.razor_static_link_hp1,
                R.drawable.razor_unstable_current_hp1,
                R.drawable.razor_eye_of_the_storm_hp1));

        heroes.add(new Hero("Venomancer",
                R.drawable.venomancer_full,
                R.drawable.venomancer_venomous_gale_hp1,
                R.drawable.venomancer_poison_sting_hp1,
                R.drawable.venomancer_plague_ward_hp1,
                R.drawable.venomancer_poison_nova_hp1));

        heroes.add(new Hero("Faceless Void",
                R.drawable.faceless_void_full,
                R.drawable.faceless_void_time_walk_hp1,
                R.drawable.faceless_void_backtrack_hp1,
                R.drawable.faceless_void_time_lock_hp1,
                R.drawable.faceless_void_chronosphere_hp1));

        heroes.add(new Hero("Phantom Assassin",
                R.drawable.phantom_assassin_full,
                R.drawable.phantom_assassin_stifling_dagger_hp1,
                R.drawable.phantom_assassin_phantom_strike_hp1,
                R.drawable.phantom_assassin_blur_hp1,
                R.drawable.phantom_assassin_coup_de_grace_hp1));

        heroes.add(new Hero("Viper",
                R.drawable.viper_full,
                R.drawable.viper_poison_attack_hp1,
                R.drawable.viper_nethertoxin_hp1,
                R.drawable.viper_corrosive_skin_hp1,
                R.drawable.viper_viper_strike_hp1));

        heroes.add(new Hero("Clinkz",
                R.drawable.clinkz_full,
                R.drawable.clinkz_strafe_hp1,
                R.drawable.clinkz_searing_arrows_hp1,
                R.drawable.clinkz_wind_walk_hp1,
                R.drawable.clinkz_death_pact_hp1));

        heroes.add(new Hero("Broodmother",
                R.drawable.broodmother_full,
                R.drawable.broodmother_spawn_spiderlings_hp1,
                R.drawable.broodmother_spin_web_hp1,
                R.drawable.broodmother_incapacitating_bite_hp1,
                R.drawable.broodmother_insatiable_hunger_hp1));

        heroes.add(new Hero("Weaver",
                R.drawable.weaver_full,
                R.drawable.weaver_the_swarm_hp1,
                R.drawable.weaver_shukuchi_hp1,
                R.drawable.weaver_geminate_attack_hp1,
                R.drawable.weaver_time_lapse_hp1));

        heroes.add(new Hero("Spectre",
                R.drawable.spectre_full,
                R.drawable.spectre_spectral_dagger_hp1,
                R.drawable.spectre_desolate_hp1,
                R.drawable.spectre_dispersion_hp1,
                R.drawable.spectre_haunt_hp1));

        heroes.add(new Hero("Meepo",
                R.drawable.meepo_full,
                R.drawable.meepo_earthbind_hp1,
                R.drawable.meepo_poof_hp1,
                R.drawable.meepo_geostrike_hp1,
                R.drawable.meepo_divided_we_stand_hp1));

        heroes.add(new Hero("Nyx Assassin",
                R.drawable.nyx_assassin_full,
                R.drawable.nyx_assassin_impale_hp1,
                R.drawable.nyx_assassin_mana_burn_hp1,
                R.drawable.nyx_assassin_spiked_carapace_hp1,
                R.drawable.nyx_assassin_vendetta_hp1));

        heroes.add(new Hero("Slark",
                R.drawable.slark_full,
                R.drawable.slark_dark_pact_hp1,
                R.drawable.slark_pounce_hp1,
                R.drawable.slark_essence_shift_hp1,
                R.drawable.slark_shadow_dance_hp1));

        heroes.add(new Hero("Medusa",
                R.drawable.medusa_full,
                R.drawable.medusa_split_shot_hp1,
                R.drawable.medusa_mystic_snake_hp1,
                R.drawable.medusa_mana_shield_hp1,
                R.drawable.medusa_stone_gaze_hp1));

        heroes.add(new Hero("Crystal Maiden",
                R.drawable.crystal_maiden_full,
                R.drawable.crystal_maiden_crystal_nova_hp1,
                R.drawable.crystal_maiden_frostbite_hp1,
                R.drawable.crystal_maiden_brilliance_aura_hp1,
                R.drawable.crystal_maiden_freezing_field_hp1));

        heroes.add(new Hero("Puck",
                R.drawable.puck_full,
                R.drawable.puck_illusory_orb_hp1,
                R.drawable.puck_waning_rift_hp1,
                R.drawable.puck_phase_shift_hp1,
                R.drawable.puck_dream_coil_hp1));

        heroes.add(new Hero("Storm Spirit",
                R.drawable.storm_spirit_full,
                R.drawable.storm_spirit_static_remnant_hp1,
                R.drawable.storm_spirit_electric_vortex_hp1,
                R.drawable.storm_spirit_overload_hp1,
                R.drawable.storm_spirit_ball_lightning_hp1));

        heroes.add(new Hero("Windrunner",
                R.drawable.windrunner_full,
                R.drawable.windrunner_shackleshot_hp1,
                R.drawable.windrunner_powershot_hp1,
                R.drawable.windrunner_windrun_hp1,
                R.drawable.windrunner_focusfire_hp1));

        heroes.add(new Hero("Zuus",
                R.drawable.zuus_full,
                R.drawable.zuus_arc_lightning_hp1,
                R.drawable.zuus_lightning_bolt_hp1,
                R.drawable.zuus_static_field_hp1,
                R.drawable.zuus_thundergods_wrath_hp1));

        heroes.add(new Hero("Lina",
                R.drawable.lina_full,
                R.drawable.lina_dragon_slave_hp1,
                R.drawable.lina_light_strike_array_hp1,
                R.drawable.lina_fiery_soul_hp1,
                R.drawable.lina_laguna_blade_hp1));

        heroes.add(new Hero("Shadow Shaman",
                R.drawable.shadow_shaman_full,
                R.drawable.shadow_shaman_ether_shock_hp1,
                R.drawable.shadow_shaman_voodoo_hp1,
                R.drawable.shadow_shaman_shackles_hp1,
                R.drawable.shadow_shaman_mass_serpent_ward_hp1));

        heroes.add(new Hero("Tinker",
                R.drawable.tinker_full,
                R.drawable.tinker_laser_hp1,
                R.drawable.tinker_heat_seeking_missile_hp1,
                R.drawable.tinker_march_of_the_machines_hp1,
                R.drawable.tinker_rearm_hp1));

        heroes.add(new Hero("Nature's Prophet",
                R.drawable.furion_full,
                R.drawable.furion_sprout_hp1,
                R.drawable.furion_teleportation_hp1,
                R.drawable.furion_force_of_nature_hp1,
                R.drawable.furion_wrath_of_nature_hp1));

        heroes.add(new Hero("Enchantress",
                R.drawable.enchantress_full,
                R.drawable.enchantress_untouchable_hp1,
                R.drawable.enchantress_enchant_hp1,
                R.drawable.enchantress_natures_attendants_hp1,
                R.drawable.enchantress_impetus_hp1));

        heroes.add(new Hero("Jakiro",
                R.drawable.jakiro_full,
                R.drawable.jakiro_dual_breath_hp1,
                R.drawable.jakiro_ice_path_hp1,
                R.drawable.jakiro_liquid_fire_hp1,
                R.drawable.jakiro_macropyre_hp1));

        heroes.add(new Hero("Chen",
                R.drawable.chen_full,
                R.drawable.chen_penitence_hp1,
                R.drawable.chen_test_of_faith_hp1,
                R.drawable.chen_holy_persuasion_hp1,
                R.drawable.chen_hand_of_god_hp1));

        heroes.add(new Hero("Silencer",
                R.drawable.silencer_full,
                R.drawable.silencer_curse_of_the_silent_hp1,
                R.drawable.silencer_glaives_of_wisdom_hp1,
                R.drawable.silencer_last_word_hp1,
                R.drawable.silencer_global_silence_hp1));

        heroes.add(new Hero("Ogr Magi",
                R.drawable.ogre_magi_full,
                R.drawable.ogre_magi_fireblast_hp1,
                R.drawable.ogre_magi_ignite_hp1,
                R.drawable.ogre_magi_bloodlust_hp1,
                R.drawable.ogre_magi_multicast_hp1));

        heroes.add(new Hero("Rubick",
                R.drawable.rubick_full,
                R.drawable.rubick_telekinesis_hp1,
                R.drawable.rubick_fade_bolt_hp1,
                R.drawable.rubick_null_field_hp1,
                R.drawable.rubick_spell_steal_hp1));

        heroes.add(new Hero("Disruptor",
                R.drawable.disruptor_full,
                R.drawable.disruptor_thunder_strike_hp1,
                R.drawable.disruptor_glimpse_hp1,
                R.drawable.disruptor_kinetic_field_hp1,
                R.drawable.disruptor_static_storm_hp1));

        heroes.add(new Hero("Keeper Of The Light",
                R.drawable.keeper_of_the_light_full,
                R.drawable.keeper_of_the_light_illuminate_hp1,
                R.drawable.keeper_of_the_light_mana_leak_hp1,
                R.drawable.keeper_of_the_light_chakra_magic_hp1,
                R.drawable.keeper_of_the_light_spirit_form_hp1));

        heroes.add(new Hero("Skywrath Mage",
                R.drawable.skywrath_mage_full,
                R.drawable.skywrath_mage_arcane_bolt_hp1,
                R.drawable.skywrath_mage_concussive_shot_hp1,
                R.drawable.skywrath_mage_ancient_seal_hp1,
                R.drawable.skywrath_mage_mystic_flare_hp1));

        heroes.add(new Hero("Bane",
                R.drawable.bane_full,
                R.drawable.bane_enfeeble_hp1,
                R.drawable.bane_brain_sap_hp1,
                R.drawable.bane_nightmare_hp1,
                R.drawable.bane_fiends_grip_hp1));

        heroes.add(new Hero("Lich",
                R.drawable.lich_full,
                R.drawable.lich_frost_nova_hp1,
                R.drawable.lich_frost_armor_hp1,
                R.drawable.lich_dark_ritual_hp1,
                R.drawable.lich_chain_frost_hp1));

        heroes.add(new Hero("Lion",
                R.drawable.lion_full,
                R.drawable.lion_impale_hp1,
                R.drawable.lion_voodoo_hp1,
                R.drawable.lion_mana_drain_hp1,
                R.drawable.lion_finger_of_death_hp1));

        heroes.add(new Hero("Witch Doctor",
                R.drawable.witch_doctor_full,
                R.drawable.witch_doctor_paralyzing_cask_hp1,
                R.drawable.witch_doctor_voodoo_restoration_hp1,
                R.drawable.witch_doctor_maledict_hp1,
                R.drawable.witch_doctor_death_ward_hp1));

        heroes.add(new Hero("Enigma",
                R.drawable.enigma_full,
                R.drawable.enigma_malefice_hp1,
                R.drawable.enigma_demonic_conversion_hp1,
                R.drawable.enigma_midnight_pulse_hp1,
                R.drawable.enigma_black_hole_hp1));

        heroes.add(new Hero("Necrolyte",
                R.drawable.necrolyte_full,
                R.drawable.necrolyte_death_pulse_hp1,
                R.drawable.necrolyte_heartstopper_aura_hp1,
                R.drawable.necrolyte_sadist_hp1,
                R.drawable.necrolyte_reapers_scythe_hp1));

        heroes.add(new Hero("Warlock",
                R.drawable.warlock_full,
                R.drawable.warlock_fatal_bonds_hp1,
                R.drawable.warlock_shadow_word_hp1,
                R.drawable.warlock_upheaval_hp1,
                R.drawable.warlock_rain_of_chaos_hp1));

        heroes.add(new Hero("Quen Of Pain",
                R.drawable.queenofpain_full,
                R.drawable.queenofpain_shadow_strike_hp1,
                R.drawable.queenofpain_blink_hp1,
                R.drawable.queenofpain_scream_of_pain_hp1,
                R.drawable.queenofpain_sonic_wave_hp1));

        heroes.add(new Hero("Death Prophet",
                R.drawable.death_prophet_full,
                R.drawable.death_prophet_carrion_swarm_hp1,
                R.drawable.death_prophet_silence_hp1,
                R.drawable.death_prophet_witchcraft_hp1,
                R.drawable.death_prophet_exorcism_hp1));

        heroes.add(new Hero("Pugna",
                R.drawable.pugna_full,
                R.drawable.pugna_nether_blast_hp1,
                R.drawable.pugna_decrepify_hp1,
                R.drawable.pugna_nether_ward_hp1,
                R.drawable.pugna_life_drain_hp1));

        heroes.add(new Hero("Dazzle",
                R.drawable.dazzle_full,
                R.drawable.dazzle_poison_touch_hp1,
                R.drawable.dazzle_shallow_grave_hp1,
                R.drawable.dazzle_shadow_wave_hp1,
                R.drawable.dazzle_weave_hp1));

        heroes.add(new Hero("Leshrac",
                R.drawable.leshrac_full,
                R.drawable.leshrac_split_earth_hp1,
                R.drawable.leshrac_diabolic_edict_hp1,
                R.drawable.leshrac_lightning_storm_hp1,
                R.drawable.leshrac_pulse_nova_hp1));

        heroes.add(new Hero("Dark Seer",
                R.drawable.dark_seer_full,
                R.drawable.dark_seer_vacuum_hp1,
                R.drawable.dark_seer_ion_shell_hp1,
                R.drawable.dark_seer_surge_hp1,
                R.drawable.dark_seer_wall_of_replica_hp1));

        heroes.add(new Hero("Batrider",
                R.drawable.batrider_full,
                R.drawable.batrider_sticky_napalm_hp1,
                R.drawable.batrider_flamebreak_hp1,
                R.drawable.batrider_firefly_hp1,
                R.drawable.batrider_flaming_lasso_hp1));

        heroes.add(new Hero("Ancient Apparition",
                R.drawable.ancient_apparition_full,
                R.drawable.ancient_apparition_cold_feet_hp1,
                R.drawable.ancient_apparition_ice_vortex_hp1,
                R.drawable.ancient_apparition_chilling_touch_hp1,
                R.drawable.ancient_apparition_ice_blast_hp1));

        heroes.add(new Hero("Invoker",
                R.drawable.invoker_full,
                R.drawable.invoker_quas_hp1,
                R.drawable.invoker_wex_hp1,
                R.drawable.invoker_exort_hp1,
                R.drawable.invoker_invoke_hp1));

        heroes.add(new Hero("Outworld Devourer",
                R.drawable.obsidian_destroyer_full,
                R.drawable.obsidian_destroyer_arcane_orb_hp1,
                R.drawable.obsidian_destroyer_astral_imprisonment_hp1,
                R.drawable.obsidian_destroyer_essence_aura_hp1,
                R.drawable.obsidian_destroyer_sanity_eclipse_hp1));

        heroes.add(new Hero("Shadow Demon",
                R.drawable.shadow_demon_full,
                R.drawable.shadow_demon_disruption_hp1,
                R.drawable.shadow_demon_soul_catcher_hp1,
                R.drawable.shadow_demon_shadow_poison_hp1,
                R.drawable.shadow_demon_demonic_purge_hp1));

        heroes.add(new Hero("Visage",
                R.drawable.visage_full,
                R.drawable.visage_grave_chill_hp1,
                R.drawable.visage_soul_assumption_hp1,
                R.drawable.visage_gravekeepers_cloak_hp1,
                R.drawable.visage_summon_familiars_hp1));


//        heroes.add(new Hero("",
//                R.drawable.,
//                R.drawable.,
//                R.drawable.,
//                R.drawable.,
//                R.drawable.));
    }

    public Hero getHero(int idx) {
        return heroes.get(idx);
    }

    public int size() {
        return heroes.size();
    }
}
