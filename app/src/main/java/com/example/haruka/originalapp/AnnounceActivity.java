package com.example.haruka.originalapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;


import java.util.Random;


/**
 * Created by Haruka on 15/06/22.
 */
public class AnnounceActivity extends ActionBarActivity {
    Random r = new Random();
    private Common common;
    int outer0 = 0;
    int tops0 = 0;
    int bottoms0 = 0;
    int onepiece0 = 0;
    int shoes0 = 0;
    int socks0 = 0;

    ImageView outer;
    ImageView tops;
    ImageView bottoms;
    ImageView onepiece;
    ImageView shoes;
    ImageView socks;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_announce);

        common = (Common) getApplication();

        outer = (ImageView) findViewById(R.id.imageView12);
        tops = (ImageView) findViewById(R.id.imageView13);
        bottoms = (ImageView) findViewById(R.id.imageView14);
        onepiece = (ImageView) findViewById(R.id.imageView15);
        shoes = (ImageView) findViewById(R.id.imageView16);
        socks = (ImageView) findViewById(R.id.imageView17);

        day();
        weather();
        season();
    }

    public void click(View v) {
        Intent i = new Intent(this, EndActivity.class);
        startActivity(i);
    }


    private void day() {
        if (common.day == 1) {

        } else if (common.day == 2 || common.day == 4) {
            shoes.setImageResource(R.drawable.shoes_ss_sandal);

            int random2b = r.nextInt(2);
            if (random2b == 0) {
                bottoms.setImageResource(R.drawable.bottoms_all_jeans_pant);
            } else {
                bottoms.setImageResource(R.drawable.bottoms_nw_pant_short);
            }

            shoes0++;
            bottoms0++;

        } else if (common.day == 3) {

            if (common.season == 41 || common.season == 42 || common.season == 43 || common.season == 44) {
                shoes.setImageResource(R.drawable.shoes_all_sneaker);
            } else {
                shoes.setImageResource(R.drawable.shoes_all_surippon);
            }

            shoes0++;
        } else if (common.day == 5) {

            if (common.season == 41 || common.season == 42 || common.season == 43 || common.season == 44) {
                shoes.setImageResource(R.drawable.shoes_all_sneaker);
            } else {
                shoes.setImageResource(R.drawable.shoes_all_surippon);
            }

            bottoms.setImageResource(R.drawable.bottoms_all_fit_pant);

            shoes0++;
            bottoms0++;
        }
    }


    private void weather() {
        if (common.weather == 1) {

        } else if (common.weather == 2) {

        } else if (common.weather == 3) {
            if (bottoms0 == 0) {
                int random3b = r.nextInt(6);
                if (random3b == 0) {
                    bottoms.setImageResource(R.drawable.bottoms_all_loose_pant);
                }else if(random3b==1){
                    bottoms.setImageResource(R.drawable.bottoms_all_pencil);
                }else if(random3b==2){
                    bottoms.setImageResource(R.drawable.bottoms_all_skirt_mini);
                }else if(random3b==3){
                    bottoms.setImageResource(R.drawable.bottoms_all_yurupan);
                }else if(random3b==4){
                    bottoms.setImageResource(R.drawable.bottoms_nw_gaucho_white);
                }else if(random3b==5){
                    bottoms.setImageResource(R.drawable.bottoms_nw_pant_short);
                }
            bottoms0++;
            }

        } else if(common.weather==4){
            if(outer0==0){
                int random4o=r.nextInt(2);
                if(random4o==0){
                    outer.setImageResource(R.drawable.outer_aw_down_neck);
                }else{
                    outer.setImageResource(R.drawable.outer_w_down);
                }
                outer0++;
            }
        }
    }


    private void season() {
        if (common.season == 11) {

            if (outer0 == 0) {
                int random11o = r.nextInt(5);

                if (random11o == 0) {
                    outer.setImageResource(R.drawable.outer_aw_buruzon);
                } else if (random11o == 1) {
                    outer.setImageResource(R.drawable.outer_aw_dragonnight);
                } else if (random11o == 2) {
                    outer.setImageResource(R.drawable.outer_ns_jumper);
                } else if (random11o == 3) {
                    outer.setImageResource(R.drawable.outer_ns_riders);
                } else if (random11o == 4) {
                    outer.setImageResource(R.drawable.outer_ns_trench_);
                }

                outer0++;
            }

            int random = r.nextInt(2);

            if (random == 0) {
                if (tops0 == 0) {
                    int random11t = r.nextInt(3);

                    if (random11t == 0) {
                        tops.setImageResource(R.drawable.tops_all_lace_browse);
                    } else if (random11t == 1) {
                        tops.setImageResource(R.drawable.tops_all_longt);
                    } else if (random11t == 2) {
                        tops.setImageResource(R.drawable.tops_ns_browse_longsr);
                    }
                    tops0++;
                }

                if (bottoms0 == 0) {
                    int random11b = r.nextInt(11);

                    if (random11b == 0) {
                        bottoms.setImageResource(R.drawable.bottoms_all_fit_pant);
                    } else if (random11b == 1) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_damege);
                    } else if (random11b == 2) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_skirt);
                    } else if (random11b == 3) {
                        bottoms.setImageResource(R.drawable.bottoms_all_lace_skirt);
                    } else if (random11b == 4) {
                        bottoms.setImageResource(R.drawable.bottoms_all_pencil);
                    } else if (random11b == 5) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_mini);
                    } else if (random11b == 6) {
                        bottoms.setImageResource(R.drawable.bottoms_ns_skirt_knit);
                    } else if (random11b == 7) {
                        bottoms.setImageResource(R.drawable.bottoms_all_tight_long);
                    } else if (random11b == 8) {
                        bottoms.setImageResource(R.drawable.bottoms_ns_leather_skirt);
                    } else if (random11b == 9) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_tight);
                    } else if (random11b == 10) {
                        bottoms.setImageResource(R.drawable.bottoms_nw_gaucho_white);
                    }

                    bottoms0++;
                }
            } else {
                if (onepiece0 == 0) {
                    int random11on = r.nextInt(2);
                    if (random11on == 0) {
                        onepiece.setImageResource(R.drawable.onepiece_all_basic);
                    } else {
                        onepiece.setImageResource(R.drawable.onepiece_all_half);
                    }
                    onepiece0++;
                }
            }

            if (shoes0 == 0) {
                int random11s = r.nextInt(9);
                if (random11s == 0) {
                    shoes.setImageResource(R.drawable.shoes_all_atuzoko);
                } else if (random11s == 1) {
                    shoes.setImageResource(R.drawable.shoes_all_boot_bohemian);
                } else if (random11s == 2) {
                    shoes.setImageResource(R.drawable.shoes_all_pamps);
                } else if (random11s == 3) {
                    shoes.setImageResource(R.drawable.shoes_all_rorfar);
                } else if (random11s == 4) {
                    shoes.setImageResource(R.drawable.shoes_all_sneaker);
                } else if (random11s == 5) {
                    shoes.setImageResource(R.drawable.shoes_all_surippon);
                } else if (random11s == 6) {
                    shoes.setImageResource(R.drawable.shoes_aw_boots_short);
                } else if (random11s == 7) {
                    shoes.setImageResource(R.drawable.shoes_ns_boot);
                } else if (random11s == 8) {
                    shoes.setImageResource(R.drawable.shoes_ns_short_boots);
                }
                shoes0++;
            }

            if (socks0 == 0) {
                int random11so = r.nextInt(2);
                if (random11so == 0) {
                    socks.setImageResource(R.drawable.socks_ns_regins);
                } else {

                }

                socks0++;
            }

        }

        if (common.season == 12) {

            if (outer0 == 0) {
                int random12o = r.nextInt(5);

                if (random12o == 0) {
                    outer.setImageResource(R.drawable.outer_aw_dragonnight);
                } else if (random12o == 1) {
                    outer.setImageResource(R.drawable.outer_ns_jumper);
                } else if (random12o == 2) {
                    outer.setImageResource(R.drawable.outer_ns_riders);
                } else if (random12o == 3) {
                    outer.setImageResource(R.drawable.outer_ns_trench_);
                } else if (random12o == 4) {
                    outer.setImageResource(R.drawable.outer_nw_kirde);
                }

                outer0++;
            }

            int random = r.nextInt(2);

            if (random == 0) {
                if (tops0 == 0) {
                    int random12t = r.nextInt(4);

                    if (random12t == 0) {
                        tops.setImageResource(R.drawable.tops_all_lace_browse);
                    } else if (random12t == 1) {
                        tops.setImageResource(R.drawable.tops_all_longt);
                    } else if (random12t == 2) {
                        tops.setImageResource(R.drawable.tops_all_seven_t);
                    } else if (random12t == 3) {
                        tops.setImageResource(R.drawable.tops_ns_browse_longsr);
                    }
                    tops0++;
                }

                if (bottoms0 == 0) {
                    int random12b = r.nextInt(14);

                    if (random12b == 0) {
                        bottoms.setImageResource(R.drawable.bottoms_all_fit_pant);
                    } else if (random12b == 1) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_damege);
                    } else if (random12b == 2) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_seven);
                    } else if (random12b == 3) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_skirt);
                    } else if (random12b == 4) {
                        bottoms.setImageResource(R.drawable.bottoms_all_lace_skirt);
                    } else if (random12b == 5) {
                        bottoms.setImageResource(R.drawable.bottoms_all_loose_pant);
                    } else if (random12b == 6) {
                        bottoms.setImageResource(R.drawable.bottoms_all_pencil);
                    } else if (random12b == 7) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_mini);
                    } else if (random12b == 8) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_tight);
                    } else if (random12b == 9) {
                        bottoms.setImageResource(R.drawable.bottoms_ns_skirt_knit);
                    } else if (random12b == 10) {
                        bottoms.setImageResource(R.drawable.bottoms_all_tight_long);
                    } else if (random12b == 11) {
                        bottoms.setImageResource(R.drawable.bottoms_all_yurupan);
                    } else if (random12b == 12) {
                        bottoms.setImageResource(R.drawable.bottoms_ns_leather_skirt);
                    } else if (random12b == 13) {
                        bottoms.setImageResource(R.drawable.bottoms_nw_gaucho_white);
                    }

                    bottoms0++;
                }
            } else {
                if (onepiece0 == 0) {
                    int random12on = r.nextInt(4);
                    if (random12on == 0) {
                        onepiece.setImageResource(R.drawable.onepiece_all_basic);
                    } else if (random12on == 1) {
                        onepiece.setImageResource(R.drawable.onepiece_all_half);
                    } else if (random12on == 2) {
                        onepiece.setImageResource(R.drawable.onepiece_all_nosreave);
                    } else if (random12on == 3) {
                        onepiece.setImageResource(R.drawable.onepiece_ss_nosleaves);
                    }
                    onepiece0++;
                }
            }

            if (shoes0 == 0) {
                int random12s = r.nextInt(8);
                if (random12s == 0) {
                    shoes.setImageResource(R.drawable.shoes_all_atuzoko);
                } else if (random12s == 1) {
                    shoes.setImageResource(R.drawable.shoes_all_boot_bohemian);
                } else if (random12s == 2) {
                    shoes.setImageResource(R.drawable.shoes_all_pamps);
                } else if (random12s == 3) {
                    shoes.setImageResource(R.drawable.shoes_all_rorfar);
                } else if (random12s == 4) {
                    shoes.setImageResource(R.drawable.shoes_all_sneaker);
                } else if (random12s == 5) {
                    shoes.setImageResource(R.drawable.shoes_all_surippon);
                } else if (random12s == 6) {
                    shoes.setImageResource(R.drawable.shoes_ns_short_boots);
                } else if (random12s == 7) {
                    shoes.setImageResource(R.drawable.shoes_ss_petapeta);
                }
                shoes0++;
            }

            if (socks0 == 0) {
                int random12so = r.nextInt(2);
                if (random12so == 0) {
                    socks.setImageResource(R.drawable.socks_ns_regins);
                } else {

                }

                socks0++;
            }


        }


        if (common.season == 13) {

            if (outer0 == 0) {
                int random13o = r.nextInt(6);

                if (random13o == 0) {
                    outer.setImageResource(R.drawable.outer_ns_jacket);
                } else if (random13o == 1) {
                    outer.setImageResource(R.drawable.outer_ns_jacket_suit);
                } else if (random13o == 2) {
                    outer.setImageResource(R.drawable.outer_ns_kirde);
                } else if (random13o == 3) {
                    outer.setImageResource(R.drawable.outer_ns_nosreave);
                } else if (random13o == 4) {
                    outer.setImageResource(R.drawable.outer_ns_trench_);
                } else if (random13o == 5) {
                    outer.setImageResource(R.drawable.outer_nw_kirde);
                }

                outer0++;
            }

            int random = r.nextInt(2);

            if (random == 0) {
                if (tops0 == 0) {
                    int random13t = r.nextInt(9);

                    if (random13t == 0) {
                        tops.setImageResource(R.drawable.tops_all_lace_browse);
                    } else if (random13t == 1) {
                        tops.setImageResource(R.drawable.tops_all_longt);
                    } else if (random13t == 2) {
                        tops.setImageResource(R.drawable.tops_all_seven_t);
                    } else if (random13t == 3) {
                        tops.setImageResource(R.drawable.tops_ns_browse_longsr);
                    } else if (random13t == 4) {
                        tops.setImageResource(R.drawable.tops_ss_browse_no);
                    } else if (random13t == 5) {
                        tops.setImageResource(R.drawable.tops_ss_browse_run);
                    } else if (random13t == 6) {
                        tops.setImageResource(R.drawable.tops_ss_longt);
                    } else if (random13t == 7) {
                        tops.setImageResource(R.drawable.tops_ss_short);
                    } else if (random13t == 8) {
                        tops.setImageResource(R.drawable.tops_ss_t_basic);
                    }
                    tops0++;
                }

                if (bottoms0 == 0) {
                    int random13b = r.nextInt(13);

                    if (random13b == 0) {
                        bottoms.setImageResource(R.drawable.bottoms_all_fit_pant);
                    } else if (random13b == 1) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_damege);
                    } else if (random13b == 2) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_seven);
                    } else if (random13b == 3) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_skirt);
                    } else if (random13b == 4) {
                        bottoms.setImageResource(R.drawable.bottoms_all_loose_pant);
                    } else if (random13b == 5) {
                        bottoms.setImageResource(R.drawable.bottoms_all_pencil);
                    } else if (random13b == 6) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_mini);
                    } else if (random13b == 7) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_tight);
                    } else if (random13b == 8) {
                        bottoms.setImageResource(R.drawable.bottoms_ns_skirt_knit);
                    } else if (random13b == 9) {
                        bottoms.setImageResource(R.drawable.bottoms_all_tight_long);
                    } else if (random13b == 10) {
                        bottoms.setImageResource(R.drawable.bottoms_all_yurupan);
                    } else if (random13b == 11) {
                        bottoms.setImageResource(R.drawable.bottoms_nw_gaucho);
                    } else if (random13b == 12) {
                        bottoms.setImageResource(R.drawable.bottoms_nw_gaucho_white);
                    }

                    bottoms0++;
                }
            } else {
                if (onepiece0 == 0) {
                    int random13on = r.nextInt(6);
                    if (random13on == 0) {
                        onepiece.setImageResource(R.drawable.onepice_ss_denim);
                    } else if (random13on == 1) {
                        onepiece.setImageResource(R.drawable.onepiece_all_basic);
                    } else if (random13on == 2) {
                        onepiece.setImageResource(R.drawable.onepiece_all_half);
                    } else if (random13on == 3) {
                        onepiece.setImageResource(R.drawable.onepiece_all_nosreave);
                    } else if (random13on == 4) {
                        onepiece.setImageResource(R.drawable.onepiece_ss_allinone);
                    } else if (random13on == 5) {
                        onepiece.setImageResource(R.drawable.onepiece_ss_nosleaves);
                    }
                    onepiece0++;
                }
            }

            if (shoes0 == 0) {
                int random13s = r.nextInt(8);
                if (random13s == 0) {
                    shoes.setImageResource(R.drawable.shoes_all_atuzoko);
                } else if (random13s == 1) {
                    shoes.setImageResource(R.drawable.shoes_all_pamps);
                } else if (random13s == 2) {
                    shoes.setImageResource(R.drawable.shoes_all_rorfar);
                } else if (random13s == 3) {
                    shoes.setImageResource(R.drawable.shoes_all_sneaker);
                } else if (random13s == 4) {
                    shoes.setImageResource(R.drawable.shoes_all_surippon);
                } else if (random13s == 5) {
                    shoes.setImageResource(R.drawable.shoes_ss_atuzoko_sandal);
                } else if (random13s == 6) {
                    shoes.setImageResource(R.drawable.shoes_ss_petapeta);
                } else if (random13s == 7) {
                    shoes.setImageResource(R.drawable.shoes_ss_sandal);
                }
                shoes0++;
            }

            if (socks0 == 0) {
                int random13so = r.nextInt(2);
                if (random13so == 0) {
                    socks.setImageResource(R.drawable.socks_ns_regins);
                } else {

                }

                socks0++;
            }


        }


        if (common.season == 14) {

            if (outer0 == 0) {
                int random14o = r.nextInt(6);

                if (random14o == 0) {
                    outer.setImageResource(R.drawable.outer_ns_jacket);
                } else if (random14o == 1) {
                    outer.setImageResource(R.drawable.outer_ns_jacket_suit);
                } else if (random14o == 2) {
                    outer.setImageResource(R.drawable.outer_ns_kirde);
                } else if (random14o == 3) {
                    outer.setImageResource(R.drawable.outer_ns_nosreave);
                } else if (random14o == 4) {
                    outer.setImageResource(R.drawable.outer_nw_jeans_jumper);
                } else if (random14o == 5) {
                    outer.setImageResource(R.drawable.outer_nw_kirde_bohe);
                }

                outer0++;
            }

            int random = r.nextInt(2);

            if (random == 0) {
                if (tops0 == 0) {
                    int random14t = r.nextInt(10);

                    if (random14t == 0) {
                        tops.setImageResource(R.drawable.tops_all_lace_browse);
                    } else if (random14t == 1) {
                        tops.setImageResource(R.drawable.tops_all_longt);
                    } else if (random14t == 2) {
                        tops.setImageResource(R.drawable.tops_all_seven_t);
                    } else if (random14t == 3) {
                        tops.setImageResource(R.drawable.tops_nw_short_t);
                    } else if (random14t == 4) {
                        tops.setImageResource(R.drawable.tops_ss_browse_no);
                    } else if (random14t == 5) {
                        tops.setImageResource(R.drawable.tops_ss_browse_run);
                    } else if (random14t == 6) {
                        tops.setImageResource(R.drawable.tops_ss_longt);
                    } else if (random14t == 7) {
                        tops.setImageResource(R.drawable.tops_ss_offsholder);
                    } else if (random14t == 8) {
                        tops.setImageResource(R.drawable.tops_ss_short);
                    } else if (random14t == 9) {
                        tops.setImageResource(R.drawable.tops_ss_t_basic);
                    }
                    tops0++;
                }

                if (bottoms0 == 0) {
                    int random14b = r.nextInt(12);

                    if (random14b == 0) {
                        bottoms.setImageResource(R.drawable.bottoms_all_fit_pant);
                    } else if (random14b == 1) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_damege);
                    } else if (random14b == 2) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_seven);
                    } else if (random14b == 3) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_skirt);
                    } else if (random14b == 4) {
                        bottoms.setImageResource(R.drawable.bottoms_all_loose_pant);
                    } else if (random14b == 5) {
                        bottoms.setImageResource(R.drawable.bottoms_all_pencil);
                    } else if (random14b == 6) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_mini);
                    } else if (random14b == 7) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_tight);
                    } else if (random14b == 8) {
                        bottoms.setImageResource(R.drawable.bottoms_all_tight_long);
                    } else if (random14b == 9) {
                        bottoms.setImageResource(R.drawable.bottoms_all_yurupan);
                    } else if (random14b == 10) {
                        bottoms.setImageResource(R.drawable.bottoms_nw_gaucho);
                    } else if (random14b == 11) {
                        bottoms.setImageResource(R.drawable.bottoms_nw_gaucho_white);
                    }

                    bottoms0++;
                }
            } else {
                if (onepiece0 == 0) {
                    int random14on = r.nextInt(7);
                    if (random14on == 0) {
                        onepiece.setImageResource(R.drawable.onepice_ss_denim);
                    } else if (random14on == 1) {
                        onepiece.setImageResource(R.drawable.onepiece_all_basic);
                    } else if (random14on == 2) {
                        onepiece.setImageResource(R.drawable.onepiece_all_half);
                    } else if (random14on == 3) {
                        onepiece.setImageResource(R.drawable.onepiece_all_nosreave);
                    } else if (random14on == 4) {
                        onepiece.setImageResource(R.drawable.onepiece_ss_allinone);
                    } else if (random14on == 5) {
                        onepiece.setImageResource(R.drawable.onepiece_ss_nosleaves);
                    } else if (random14on == 6) {
                        onepiece.setImageResource(R.drawable.onepiece_ss_saten);
                    }
                    onepiece0++;
                }
            }

            if (shoes0 == 0) {
                int random14s = r.nextInt(7);
                if (random14s == 0) {
                    shoes.setImageResource(R.drawable.shoes_all_atuzoko);
                } else if (random14s == 1) {
                    shoes.setImageResource(R.drawable.shoes_all_pamps);
                } else if (random14s == 2) {
                    shoes.setImageResource(R.drawable.shoes_all_sneaker);
                } else if (random14s == 3) {
                    shoes.setImageResource(R.drawable.shoes_all_surippon);
                } else if (random14s == 4) {
                    shoes.setImageResource(R.drawable.shoes_ss_atuzoko_sandal);
                } else if (random14s == 5) {
                    shoes.setImageResource(R.drawable.shoes_ss_petapeta);
                } else if (random14s == 6) {
                    shoes.setImageResource(R.drawable.shoes_ss_sandal);
                }
                shoes0++;
            }

            if (socks0 == 0) {

            }


        }


        if (common.season == 21) {

            if (outer0 == 0) {
                int random21o = r.nextInt(6);

                if (random21o == 0) {
                    outer.setImageResource(R.drawable.outer_ns_jacket);
                } else if (random21o == 1) {
                    outer.setImageResource(R.drawable.outer_ns_jacket_suit);
                } else if (random21o == 2) {
                    outer.setImageResource(R.drawable.outer_ns_kirde);
                } else if (random21o == 3) {
                    outer.setImageResource(R.drawable.outer_ns_nosreave);
                } else if (random21o == 4) {
                    outer.setImageResource(R.drawable.outer_nw_jeans_jumper);
                } else if (random21o == 5) {
                    outer.setImageResource(R.drawable.outer_nw_kirde_bohe);
                }

                outer0++;
            }

            int random = r.nextInt(2);

            if (random == 0) {
                if (tops0 == 0) {
                    int random21t = r.nextInt(10);

                    if (random21t == 0) {
                        tops.setImageResource(R.drawable.tops_all_lace_browse);
                    } else if (random21t == 1) {
                        tops.setImageResource(R.drawable.tops_all_longt);
                    } else if (random21t == 2) {
                        tops.setImageResource(R.drawable.tops_all_seven_t);
                    } else if (random21t == 3) {
                        tops.setImageResource(R.drawable.tops_nw_short_t);
                    } else if (random21t == 4) {
                        tops.setImageResource(R.drawable.tops_ss_browse_no);
                    } else if (random21t == 5) {
                        tops.setImageResource(R.drawable.tops_ss_browse_run);
                    } else if (random21t == 6) {
                        tops.setImageResource(R.drawable.tops_ss_longt);
                    } else if (random21t == 7) {
                        tops.setImageResource(R.drawable.tops_ss_offsholder);
                    } else if (random21t == 8) {
                        tops.setImageResource(R.drawable.tops_ss_short);
                    } else if (random21t == 9) {
                        tops.setImageResource(R.drawable.tops_ss_t_basic);
                    }
                    tops0++;
                }

                if (bottoms0 == 0) {
                    int random21b = r.nextInt(13);

                    if (random21b == 0) {
                        bottoms.setImageResource(R.drawable.bottoms_all_fit_pant);
                    } else if (random21b == 1) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_damege);
                    } else if (random21b == 2) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_seven);
                    } else if (random21b == 3) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_skirt);
                    } else if (random21b == 4) {
                        bottoms.setImageResource(R.drawable.bottoms_all_loose_pant);
                    } else if (random21b == 5) {
                        bottoms.setImageResource(R.drawable.bottoms_all_pencil);
                    } else if (random21b == 6) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_mini);
                    } else if (random21b == 7) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_tight);
                    } else if (random21b == 8) {
                        bottoms.setImageResource(R.drawable.bottoms_all_tight_long);
                    } else if (random21b == 9) {
                        bottoms.setImageResource(R.drawable.bottoms_all_yurupan);
                    } else if (random21b == 10) {
                        bottoms.setImageResource(R.drawable.bottoms_nw_gaucho);
                    } else if (random21b == 11) {
                        bottoms.setImageResource(R.drawable.bottoms_nw_gaucho_white);
                    } else {
                        bottoms.setImageResource(R.drawable.socks_ss_reginsu);
                    }

                    bottoms0++;
                }
            } else {
                if (onepiece0 == 0) {
                    int random21on = r.nextInt(7);
                    if (random21on == 0) {
                        onepiece.setImageResource(R.drawable.onepice_ss_denim);
                    } else if (random21on == 1) {
                        onepiece.setImageResource(R.drawable.onepiece_all_basic);
                    } else if (random21on == 2) {
                        onepiece.setImageResource(R.drawable.onepiece_all_half);
                    } else if (random21on == 3) {
                        onepiece.setImageResource(R.drawable.onepiece_all_nosreave);
                    } else if (random21on == 4) {
                        onepiece.setImageResource(R.drawable.onepiece_ss_allinone);
                    } else if (random21on == 5) {
                        onepiece.setImageResource(R.drawable.onepiece_ss_nosleaves);
                    } else if (random21on == 6) {
                        onepiece.setImageResource(R.drawable.onepiece_ss_saten);
                    }
                    onepiece0++;
                }
            }

            if (shoes0 == 0) {
                int random21s = r.nextInt(7);
                if (random21s == 0) {
                    shoes.setImageResource(R.drawable.shoes_all_atuzoko);
                } else if (random21s == 1) {
                    shoes.setImageResource(R.drawable.shoes_all_pamps);
                } else if (random21s == 2) {
                    shoes.setImageResource(R.drawable.shoes_all_sneaker);
                } else if (random21s == 3) {
                    shoes.setImageResource(R.drawable.shoes_all_surippon);
                } else if (random21s == 4) {
                    shoes.setImageResource(R.drawable.shoes_ss_atuzoko_sandal);
                } else if (random21s == 5) {
                    shoes.setImageResource(R.drawable.shoes_ss_petapeta);
                } else if (random21s == 6) {
                    shoes.setImageResource(R.drawable.shoes_ss_sandal);
                }
                shoes0++;
            }

            if (socks0 == 0) {

            }

        }


        if (common.season == 22) {

            if (outer0 == 0) {
                int random22o = r.nextInt(3);

                if (random22o == 0) {
                    outer.setImageResource(R.drawable.outer_nw_jeans_jumper);
                } else if (random22o == 1) {
                    outer.setImageResource(R.drawable.outer_nw_kirde_bohe);
                } else if (random22o == 2) {

                }

                outer0++;
            }

            int random = r.nextInt(2);

            if (random == 0) {
                if (tops0 == 0) {
                    int random22t = r.nextInt(9);

                    if (random22t == 0) {
                        tops.setImageResource(R.drawable.tops_all_seven_t);
                    } else if (random22t == 1) {
                        tops.setImageResource(R.drawable.tops_nw_short_t);
                    } else if (random22t == 2) {
                        tops.setImageResource(R.drawable.tops_ss_browse_no);
                    } else if (random22t == 3) {
                        tops.setImageResource(R.drawable.tops_ss_browse_run);
                    } else if (random22t == 4) {
                        tops.setImageResource(R.drawable.tops_ss_lace_running);
                    } else if (random22t == 5) {
                        tops.setImageResource(R.drawable.tops_ss_longt);
                    } else if (random22t == 6) {
                        tops.setImageResource(R.drawable.tops_ss_offsholder);
                    } else if (random22t == 7) {
                        tops.setImageResource(R.drawable.tops_ss_short);
                    } else if (random22t == 8) {
                        tops.setImageResource(R.drawable.tops_ss_t_basic);
                    }
                    tops0++;
                }

                if (bottoms0 == 0) {
                    int random22b = r.nextInt(13);

                    if (random22b == 0) {
                        bottoms.setImageResource(R.drawable.bottoms_all_fit_pant);
                    } else if (random22b == 1) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_damege);
                    } else if (random22b == 2) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_seven);
                    } else if (random22b == 3) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_skirt);
                    } else if (random22b == 4) {
                        bottoms.setImageResource(R.drawable.bottoms_all_loose_pant);
                    } else if (random22b == 5) {
                        bottoms.setImageResource(R.drawable.bottoms_all_pencil);
                    } else if (random22b == 6) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_mini);
                    } else if (random22b == 7) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_tight);
                    } else if (random22b == 8) {
                        bottoms.setImageResource(R.drawable.bottoms_all_yurupan);
                    } else if (random22b == 9) {
                        bottoms.setImageResource(R.drawable.bottoms_nw_gaucho);
                    } else if (random22b == 10) {
                        bottoms.setImageResource(R.drawable.bottoms_nw_gaucho_white);
                    } else if (random22b == 11) {
                        bottoms.setImageResource(R.drawable.bottoms_nw_pant_short);
                    } else {
                        bottoms.setImageResource(R.drawable.socks_ss_reginsu);
                    }

                    bottoms0++;
                }
            } else {
                if (onepiece0 == 0) {
                    int random22on = r.nextInt(8);
                    if (random22on == 0) {
                        onepiece.setImageResource(R.drawable.onepice_ss_denim);
                    } else if (random22on == 1) {
                        onepiece.setImageResource(R.drawable.onepiece_all_basic);
                    } else if (random22on == 2) {
                        onepiece.setImageResource(R.drawable.onepiece_all_half);
                    } else if (random22on == 3) {
                        onepiece.setImageResource(R.drawable.onepiece_all_nosreave);
                    } else if (random22on == 4) {
                        onepiece.setImageResource(R.drawable.onepiece_ss_allinone);
                    } else if (random22on == 5) {
                        onepiece.setImageResource(R.drawable.onepiece_ss_allinone_short);
                    } else if (random22on == 6) {
                        onepiece.setImageResource(R.drawable.onepiece_ss_nosleaves);
                    } else if (random22on == 7) {
                        onepiece.setImageResource(R.drawable.onepiece_ss_saten);
                    }
                    onepiece0++;
                }
            }

            if (shoes0 == 0) {
                int random22s = r.nextInt(7);
                if (random22s == 0) {
                    shoes.setImageResource(R.drawable.shoes_all_atuzoko);
                } else if (random22s == 1) {
                    shoes.setImageResource(R.drawable.shoes_all_pamps);
                } else if (random22s == 2) {
                    shoes.setImageResource(R.drawable.shoes_all_sneaker);
                } else if (random22s == 3) {
                    shoes.setImageResource(R.drawable.shoes_all_surippon);
                } else if (random22s == 4) {
                    shoes.setImageResource(R.drawable.shoes_ss_atuzoko_sandal);
                } else if (random22s == 5) {
                    shoes.setImageResource(R.drawable.shoes_ss_petapeta);
                } else if (random22s == 6) {
                    shoes.setImageResource(R.drawable.shoes_ss_sandal);
                }
                shoes0++;
            }

            if (socks0 == 0) {

            }


        }


        if (common.season == 23) {

            if (outer0 == 0) {
                int random23o = r.nextInt(2);

                if (random23o == 0) {
                    outer.setImageResource(R.drawable.outer_nw_kirde_bohe);
                } else if (random23o == 1) {

                }

                outer0++;
            }

            int random = r.nextInt(2);

            if (random == 0) {
                if (tops0 == 0) {
                    int random23t = r.nextInt(11);

                    if (random23t == 0) {
                        tops.setImageResource(R.drawable.tops_all_seven_t);
                    } else if (random23t == 1) {
                        tops.setImageResource(R.drawable.tops_nw_short_t);
                    } else if (random23t == 2) {
                        tops.setImageResource(R.drawable.tops_s_running);
                    } else if (random23t == 3) {
                        tops.setImageResource(R.drawable.tops_ss_browse_no);
                    } else if (random23t == 4) {
                        tops.setImageResource(R.drawable.tops_ss_browse_run);
                    } else if (random23t == 5) {
                        tops.setImageResource(R.drawable.tops_ss_lace_running);
                    } else if (random23t == 6) {
                        tops.setImageResource(R.drawable.tops_ss_longt);
                    } else if (random23t == 7) {
                        tops.setImageResource(R.drawable.tops_ss_offsholder);
                    } else if (random23t == 8) {
                        tops.setImageResource(R.drawable.tops_ss_runnind);
                    } else if (random23t == 9) {
                        tops.setImageResource(R.drawable.tops_ss_short);
                    } else if (random23t == 10) {
                        tops.setImageResource(R.drawable.tops_ss_t_basic);
                    }
                    tops0++;
                }

                if (bottoms0 == 0) {
                    int random23b = r.nextInt(12);

                    if (random23b == 0) {
                        bottoms.setImageResource(R.drawable.bottoms_all_fit_pant);
                    } else if (random23b == 1) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_pant);
                    } else if (random23b == 2) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_seven);
                    } else if (random23b == 3) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_skirt);
                    } else if (random23b == 4) {
                        bottoms.setImageResource(R.drawable.bottoms_all_loose_pant);
                    } else if (random23b == 5) {
                        bottoms.setImageResource(R.drawable.bottoms_all_pencil);
                    } else if (random23b == 6) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_mini);
                    } else if (random23b == 7) {
                        bottoms.setImageResource(R.drawable.bottoms_all_yurupan);
                    } else if (random23b == 8) {
                        bottoms.setImageResource(R.drawable.bottoms_nw_gaucho);
                    } else if (random23b == 9) {
                        bottoms.setImageResource(R.drawable.bottoms_nw_gaucho_white);
                    } else if (random23b == 10) {
                        bottoms.setImageResource(R.drawable.bottoms_nw_pant_short);
                    } else {
                        bottoms.setImageResource(R.drawable.socks_ss_reginsu);
                    }

                    bottoms0++;
                }
            } else {
                if (onepiece0 == 0) {
                    int random23on = r.nextInt(8);
                    if (random23on == 0) {
                        onepiece.setImageResource(R.drawable.onepice_ss_denim);
                    } else if (random23on == 1) {
                        onepiece.setImageResource(R.drawable.onepiece_all_basic);
                    } else if (random23on == 2) {
                        onepiece.setImageResource(R.drawable.onepiece_all_half);
                    } else if (random23on == 3) {
                        onepiece.setImageResource(R.drawable.onepiece_all_nosreave);
                    } else if (random23on == 4) {
                        onepiece.setImageResource(R.drawable.onepiece_ss_allinone);
                    } else if (random23on == 5) {
                        onepiece.setImageResource(R.drawable.onepiece_ss_allinone_short);
                    } else if (random23on == 6) {
                        onepiece.setImageResource(R.drawable.onepiece_ss_nosleaves);
                    } else if (random23on == 7) {
                        onepiece.setImageResource(R.drawable.onepiece_ss_saten);
                    }
                    onepiece0++;
                }
            }

            if (shoes0 == 0) {
                int random23s = r.nextInt(7);
                if (random23s == 0) {
                    shoes.setImageResource(R.drawable.shoes_all_atuzoko);
                } else if (random23s == 1) {
                    shoes.setImageResource(R.drawable.shoes_all_pamps);
                } else if (random23s == 2) {
                    shoes.setImageResource(R.drawable.shoes_all_surippon);
                } else if (random23s == 3) {
                    shoes.setImageResource(R.drawable.shoes_s_beachsandal);
                } else if (random23s == 4) {
                    shoes.setImageResource(R.drawable.shoes_ss_atuzoko_sandal);
                } else if (random23s == 5) {
                    shoes.setImageResource(R.drawable.shoes_ss_petapeta);
                } else if (random23s == 6) {
                    shoes.setImageResource(R.drawable.shoes_ss_sandal);
                }
                shoes0++;
            }

            if (socks0 == 0) {

            }


        }


        if (common.season == 24) {

            if (outer0 == 0) {

            }

            int random = r.nextInt(2);

            if (random == 0) {
                if (tops0 == 0) {
                    int random24t = r.nextInt(12);

                    if (random24t == 0) {
                        tops.setImageResource(R.drawable.tops_nw_bische);
                    } else if (random24t == 1) {
                        tops.setImageResource(R.drawable.tops_nw_short_t);
                    } else if (random24t == 2) {
                        tops.setImageResource(R.drawable.tops_s_bische_);
                    } else if (random24t == 3) {
                        tops.setImageResource(R.drawable.tops_ss_browse_no);
                    } else if (random24t == 4) {
                        tops.setImageResource(R.drawable.tops_ss_browse_run);
                    } else if (random24t == 5) {
                        tops.setImageResource(R.drawable.tops_ss_lace_running);
                    } else if (random24t == 6) {
                        tops.setImageResource(R.drawable.tops_ss_longt);
                    } else if (random24t == 7) {
                        tops.setImageResource(R.drawable.tops_ss_offsholder);
                    } else if (random24t == 8) {
                        tops.setImageResource(R.drawable.tops_ss_runnind);
                    } else if (random24t == 9) {
                        tops.setImageResource(R.drawable.tops_ss_short);
                    } else if (random24t == 10) {
                        tops.setImageResource(R.drawable.tops_ss_t_basic);
                    } else if (random24t == 11) {
                        tops.setImageResource(R.drawable.tops_ss_tubetop);
                    }
                    tops0++;
                }

                if (bottoms0 == 0) {
                    int random24b = r.nextInt(9);

                    if (random24b == 0) {
                        bottoms.setImageResource(R.drawable.bottoms_all_fit_pant);
                    } else if (random24b == 1) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_pant);
                    } else if (random24b == 2) {
                        bottoms.setImageResource(R.drawable.bottoms_all_loose_pant);
                    } else if (random24b == 3) {
                        bottoms.setImageResource(R.drawable.bottoms_all_pencil);
                    } else if (random24b == 4) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_mini);
                    } else if (random24b == 5) {
                        bottoms.setImageResource(R.drawable.bottoms_all_yurupan);
                    } else if (random24b == 6) {
                        bottoms.setImageResource(R.drawable.bottoms_nw_gaucho_white);
                    } else if (random24b == 7) {
                        bottoms.setImageResource(R.drawable.bottoms_nw_pant_short);
                    } else {
                        bottoms.setImageResource(R.drawable.socks_ss_reginsu);
                    }

                    bottoms0++;
                }
            } else {
                if (onepiece0 == 0) {
                    int random24on = r.nextInt(8);
                    if (random24on == 0) {
                        onepiece.setImageResource(R.drawable.onepiece_all_basic);
                    } else if (random24on == 1) {
                        onepiece.setImageResource(R.drawable.onepiece_all_half);
                    } else if (random24on == 2) {
                        onepiece.setImageResource(R.drawable.onepiece_all_nosreave);
                    } else if (random24on == 3) {
                        onepiece.setImageResource(R.drawable.onepiece_ss_allinone_short);
                    } else if (random24on == 4) {
                        onepiece.setImageResource(R.drawable.onepiece_ss_nosleaves);
                    } else if (random24on == 5) {
                        onepiece.setImageResource(R.drawable.onepiece_ss_saten);
                    }
                    onepiece0++;
                }
            }

            if (shoes0 == 0) {
                int random24s = r.nextInt(7);
                if (random24s == 0) {
                    shoes.setImageResource(R.drawable.shoes_s_beachsandal);
                } else if (random24s == 1) {
                    shoes.setImageResource(R.drawable.shoes_ss_atuzoko_sandal);
                } else if (random24s == 2) {
                    shoes.setImageResource(R.drawable.shoes_ss_petapeta);
                } else if (random24s == 3) {
                    shoes.setImageResource(R.drawable.shoes_ss_sandal);
                } else if (random24s == 4) {
                    shoes.setImageResource(R.drawable.shoes_ss_sportsandal);
                }
                shoes0++;
            }

            if (socks0 == 0) {

            }


        }


        if (common.season == 31) {

            if (outer0 == 0) {
                int random31o = r.nextInt(2);

                if (random31o == 0) {
                    outer.setImageResource(R.drawable.outer_nw_kirde_bohe);
                } else if (random31o == 1) {

                }

                outer0++;
            }

            int random = r.nextInt(2);

            if (random == 0) {
                if (tops0 == 0) {
                    int random31t = r.nextInt(8);

                    if (random31t == 0) {
                        tops.setImageResource(R.drawable.tops_all_seven_t);
                    } else if (random31t == 1) {
                        tops.setImageResource(R.drawable.tops_nw_short_t);
                    } else if (random31t == 2) {
                        tops.setImageResource(R.drawable.tops_ss_browse_no);
                    } else if (random31t == 3) {
                        tops.setImageResource(R.drawable.tops_ss_browse_run);
                    } else if (random31t == 4) {
                        tops.setImageResource(R.drawable.tops_ss_lace_running);
                    } else if (random31t == 5) {
                        tops.setImageResource(R.drawable.tops_ss_longt);
                    } else if (random31t == 6) {
                        tops.setImageResource(R.drawable.tops_ss_short);
                    } else if (random31t == 7) {
                        tops.setImageResource(R.drawable.tops_ss_t_basic);
                    }
                    tops0++;
                }

                if (bottoms0 == 0) {
                    int random31b = r.nextInt(10);

                    if (random31b == 0) {
                        bottoms.setImageResource(R.drawable.bottoms_all_fit_pant);
                    } else if (random31b == 1) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_pant);
                    } else if (random31b == 2) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_seven);
                    } else if (random31b == 3) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_skirt);
                    } else if (random31b == 4) {
                        bottoms.setImageResource(R.drawable.bottoms_all_loose_pant);
                    } else if (random31b == 5) {
                        bottoms.setImageResource(R.drawable.bottoms_all_pencil);
                    } else if (random31b == 6) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_mini);
                    } else if (random31b == 7) {
                        bottoms.setImageResource(R.drawable.bottoms_all_yurupan);
                    } else if (random31b == 8) {
                        bottoms.setImageResource(R.drawable.bottoms_nw_gaucho);
                    } else if (random31b == 9) {
                        bottoms.setImageResource(R.drawable.bottoms_nw_gaucho_white);
                    }

                    bottoms0++;
                }
            } else {
                if (onepiece0 == 0) {
                    int random31on = r.nextInt(6);
                    if (random31on == 0) {
                        onepiece.setImageResource(R.drawable.onepice_ss_denim);
                    } else if (random31on == 1) {
                        onepiece.setImageResource(R.drawable.onepiece_all_basic);
                    } else if (random31on == 2) {
                        onepiece.setImageResource(R.drawable.onepiece_all_half);
                    } else if (random31on == 3) {
                        onepiece.setImageResource(R.drawable.onepiece_all_nosreave);
                    } else if (random31on == 4) {
                        onepiece.setImageResource(R.drawable.onepiece_ss_allinone);
                    } else if (random31on == 5) {
                        onepiece.setImageResource(R.drawable.onepiece_ss_nosleaves);
                    }
                    onepiece0++;
                }
            }

            if (shoes0 == 0) {
                int random31s = r.nextInt(6);
                if (random31s == 0) {
                    shoes.setImageResource(R.drawable.shoes_all_atuzoko);
                } else if (random31s == 1) {
                    shoes.setImageResource(R.drawable.shoes_all_pamps);
                } else if (random31s == 2) {
                    shoes.setImageResource(R.drawable.shoes_all_surippon);
                } else if (random31s == 3) {
                    shoes.setImageResource(R.drawable.shoes_ss_atuzoko_sandal);
                } else if (random31s == 4) {
                    shoes.setImageResource(R.drawable.shoes_ss_petapeta);
                } else if (random31s == 5) {
                    shoes.setImageResource(R.drawable.shoes_ss_sandal);
                }
                shoes0++;
            }

            if (socks0 == 0) {

            }


        }


        if (common.season == 32) {

            if (outer0 == 0) {
                int random32o = r.nextInt(4);

                if (random32o == 0) {
                    outer.setImageResource(R.drawable.outer_nw_kirde_bohe);
                } else if (random32o == 1) {
                    outer.setImageResource(R.drawable.outer_ns_jacket);
                } else if (random32o == 2) {
                    outer.setImageResource(R.drawable.outer_ns_jacket_suit);
                } else if (random32o == 3) {
                    outer.setImageResource(R.drawable.outer_ns_kirde);
                }

                outer0++;
            }

            int random = r.nextInt(2);

            if (random == 0) {
                if (tops0 == 0) {
                    int random32t = r.nextInt(7);

                    if (random32t == 0) {
                        tops.setImageResource(R.drawable.tops_all_lace_browse);
                    } else if (random32t == 1) {
                        tops.setImageResource(R.drawable.tops_all_longt);
                    } else if (random32t == 2) {
                        tops.setImageResource(R.drawable.tops_all_seven_t);
                    } else if (random32t == 3) {
                        tops.setImageResource(R.drawable.tops_nw_short_t);
                    } else if (random32t == 4) {
                        tops.setImageResource(R.drawable.tops_ss_browse_run);
                    } else if (random32t == 5) {
                        tops.setImageResource(R.drawable.tops_ss_longt);
                    } else if (random32t == 6) {
                        tops.setImageResource(R.drawable.tops_ss_t_basic);
                    }
                    tops0++;
                }

                if (bottoms0 == 0) {
                    int random32b = r.nextInt(12);

                    if (random32b == 0) {
                        bottoms.setImageResource(R.drawable.bottoms_all_fit_pant);
                    } else if (random32b == 1) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_pant);
                    } else if (random32b == 2) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_seven);
                    } else if (random32b == 3) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_skirt);
                    } else if (random32b == 4) {
                        bottoms.setImageResource(R.drawable.bottoms_all_lace_skirt);
                    } else if (random32b == 5) {
                        bottoms.setImageResource(R.drawable.bottoms_all_loose_pant);
                    } else if (random32b == 6) {
                        bottoms.setImageResource(R.drawable.bottoms_all_pencil);
                    } else if (random32b == 7) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_mini);
                    } else if (random32b == 8) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_tight);
                    } else if (random32b == 9) {
                        bottoms.setImageResource(R.drawable.bottoms_all_yurupan);
                    } else if (random32b == 10) {
                        bottoms.setImageResource(R.drawable.bottoms_nw_gaucho);
                    } else if (random32b == 11) {
                        bottoms.setImageResource(R.drawable.bottoms_nw_gaucho_white);
                    }

                    bottoms0++;
                }
            } else {
                if (onepiece0 == 0) {
                    int random32on = r.nextInt(3);
                    if (random32on == 0) {
                        onepiece.setImageResource(R.drawable.onepiece_all_basic);
                    } else if (random32on == 1) {
                        onepiece.setImageResource(R.drawable.onepiece_all_half);
                    } else if (random32on == 2) {
                        onepiece.setImageResource(R.drawable.onepiece_all_nosreave);
                    }
                    onepiece0++;
                }
            }

            if (shoes0 == 0) {
                int random32s = r.nextInt(6);
                if (random32s == 0) {
                    shoes.setImageResource(R.drawable.shoes_all_atuzoko);
                } else if (random32s == 1) {
                    shoes.setImageResource(R.drawable.shoes_all_pamps);
                } else if (random32s == 2) {
                    shoes.setImageResource(R.drawable.shoes_all_rorfar);
                } else if (random32s == 3) {
                    shoes.setImageResource(R.drawable.shoes_all_sneaker);
                } else if (random32s == 4) {
                    shoes.setImageResource(R.drawable.shoes_all_surippon);
                } else if (random32s == 5) {
                    shoes.setImageResource(R.drawable.shoes_ss_atuzoko_sandal);
                } else if (random32s == 6) {
                    shoes.setImageResource(R.drawable.shoes_ss_petapeta);
                } else if (random32s == 7) {
                    shoes.setImageResource(R.drawable.shoes_ss_sandal);
                }
                shoes0++;
            }

            if (socks0 == 0) {
                int random32so = r.nextInt(2);
                if (random32so == 0) {
                    socks.setImageResource(R.drawable.socks_ns_regins);
                } else {

                }

            }


        }


        if (common.season == 33) {

            if (outer0 == 0) {
                int random33o = r.nextInt(5);

                if (random33o == 0) {
                    outer.setImageResource(R.drawable.outer_aw_dragonnight);
                } else if (random33o == 1) {
                    outer.setImageResource(R.drawable.outer_ns_jumper);
                } else if (random33o == 2) {
                    outer.setImageResource(R.drawable.outer_ns_riders);
                } else if (random33o == 3) {
                    outer.setImageResource(R.drawable.outer_ns_trench_);
                } else if (random33o == 4) {
                    outer.setImageResource(R.drawable.outer_nw_kirde);
                }

                outer0++;
            }

            int random = r.nextInt(2);

            if (random == 0) {
                if (tops0 == 0) {
                    int random33t = r.nextInt(4);

                    if (random33t == 0) {
                        tops.setImageResource(R.drawable.tops_all_lace_browse);
                    } else if (random33t == 1) {
                        tops.setImageResource(R.drawable.tops_all_longt);
                    } else if (random33t == 2) {
                        tops.setImageResource(R.drawable.tops_all_seven_t);
                    } else if (random33t == 3) {
                        tops.setImageResource(R.drawable.tops_ns_browse_longsr);
                    }
                    tops0++;
                }

                if (bottoms0 == 0) {
                    int random33b = r.nextInt(14);

                    if (random33b == 0) {
                        bottoms.setImageResource(R.drawable.bottoms_all_fit_pant);
                    } else if (random33b == 1) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_damege);
                    } else if (random33b == 2) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_seven);
                    } else if (random33b == 3) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_skirt);
                    } else if (random33b == 4) {
                        bottoms.setImageResource(R.drawable.bottoms_all_lace_skirt);
                    } else if (random33b == 5) {
                        bottoms.setImageResource(R.drawable.bottoms_all_loose_pant);
                    } else if (random33b == 6) {
                        bottoms.setImageResource(R.drawable.bottoms_all_pencil);
                    } else if (random33b == 7) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_mini);
                    } else if (random33b == 8) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_tight);
                    } else if (random33b == 9) {
                        bottoms.setImageResource(R.drawable.bottoms_ns_skirt_knit);
                    } else if (random33b == 10) {
                        bottoms.setImageResource(R.drawable.bottoms_all_tight_long);
                    } else if (random33b == 11) {
                        bottoms.setImageResource(R.drawable.bottoms_all_yurupan);
                    } else if (random33b == 12) {
                        bottoms.setImageResource(R.drawable.bottoms_ns_leather_skirt);
                    } else if (random33b == 13) {
                        bottoms.setImageResource(R.drawable.bottoms_nw_gaucho_white);
                    }

                    bottoms0++;
                }
            } else {
                if (onepiece0 == 0) {
                    int random33on = r.nextInt(4);
                    if (random33on == 0) {
                        onepiece.setImageResource(R.drawable.onepiece_all_basic);
                    } else if (random33on == 1) {
                        onepiece.setImageResource(R.drawable.onepiece_all_half);
                    } else if (random33on == 2) {
                        onepiece.setImageResource(R.drawable.onepiece_all_nosreave);
                    } else if (random33on == 3) {
                        onepiece.setImageResource(R.drawable.onepiece_ss_nosleaves);
                    }
                    onepiece0++;
                }
            }

            if (shoes0 == 0) {
                int random33s = r.nextInt(8);
                if (random33s == 0) {
                    shoes.setImageResource(R.drawable.shoes_all_atuzoko);
                } else if (random33s == 1) {
                    shoes.setImageResource(R.drawable.shoes_all_boot_bohemian);
                } else if (random33s == 2) {
                    shoes.setImageResource(R.drawable.shoes_all_pamps);
                } else if (random33s == 3) {
                    shoes.setImageResource(R.drawable.shoes_all_rorfar);
                } else if (random33s == 4) {
                    shoes.setImageResource(R.drawable.shoes_all_sneaker);
                } else if (random33s == 5) {
                    shoes.setImageResource(R.drawable.shoes_all_surippon);
                } else if (random33s == 6) {
                    shoes.setImageResource(R.drawable.shoes_ns_short_boots);
                } else if (random33s == 7) {
                    shoes.setImageResource(R.drawable.shoes_ss_petapeta);
                }
                shoes0++;
            }

            if (socks0 == 0) {
                int random33so = r.nextInt(2);
                if (random33so == 0) {
                    socks.setImageResource(R.drawable.socks_ns_regins);
                } else {

                }

                socks0++;
            }


        }


        if (common.season == 34) {

            if (outer0 == 0) {
                int random34o = r.nextInt(5);

                if (random34o == 0) {
                    outer.setImageResource(R.drawable.outer_aw_buruzon);
                } else if (random34o == 1) {
                    outer.setImageResource(R.drawable.outer_aw_dragonnight);
                } else if (random34o == 2) {
                    outer.setImageResource(R.drawable.outer_ns_riders);
                } else if (random34o == 3) {
                    outer.setImageResource(R.drawable.outer_ns_trench_);
                } else if (random34o == 4) {
                    outer.setImageResource(R.drawable.outer_nw_kirde);
                }

                outer0++;
            }

            int random = r.nextInt(2);

            if (random == 0) {
                if (tops0 == 0) {
                    int random34t = r.nextInt(3);

                    if (random34t == 0) {
                        tops.setImageResource(R.drawable.tops_all_lace_browse);
                    } else if (random34t == 1) {
                        tops.setImageResource(R.drawable.tops_all_longt);
                    } else if (random34t == 2) {
                        tops.setImageResource(R.drawable.tops_ns_browse_longsr);
                    }
                    tops0++;
                }

                if (bottoms0 == 0) {
                    int random34b = r.nextInt(13);

                    if (random34b == 0) {
                        bottoms.setImageResource(R.drawable.bottoms_all_fit_pant);
                    } else if (random34b == 1) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_damege);
                    } else if (random34b == 2) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_seven);
                    } else if (random34b == 3) {
                        bottoms.setImageResource(R.drawable.bottoms_all_lace_skirt);
                    } else if (random34b == 4) {
                        bottoms.setImageResource(R.drawable.bottoms_all_loose_pant);
                    } else if (random34b == 5) {
                        bottoms.setImageResource(R.drawable.bottoms_all_pencil);
                    } else if (random34b == 6) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_mini);
                    } else if (random34b == 7) {
                        bottoms.setImageResource(R.drawable.bottoms_all_yurupan);
                    } else if (random34b == 8) {
                        bottoms.setImageResource(R.drawable.bottoms_ns_skirt_knit);
                    } else if (random34b == 9) {
                        bottoms.setImageResource(R.drawable.bottoms_all_tight_long);
                    } else if (random34b == 10) {
                        bottoms.setImageResource(R.drawable.bottoms_ns_leather_skirt);
                    } else if (random34b == 11) {
                        bottoms.setImageResource(R.drawable.bottoms_ns_skirt_knit);
                    } else if (random34b == 12) {
                        bottoms.setImageResource(R.drawable.bottoms_nw_gaucho_white);
                    }

                    bottoms0++;
                }
            } else {
                if (onepiece0 == 0) {
                    onepiece.setImageResource(R.drawable.onepiece_all_basic);

                    onepiece0++;
                }
            }

            if (shoes0 == 0) {
                int random34s = r.nextInt(8);
                if (random34s == 0) {
                    shoes.setImageResource(R.drawable.shoes_all_atuzoko);
                } else if (random34s == 1) {
                    shoes.setImageResource(R.drawable.shoes_all_boot_bohemian);
                } else if (random34s == 2) {
                    shoes.setImageResource(R.drawable.shoes_all_pamps);
                } else if (random34s == 3) {
                    shoes.setImageResource(R.drawable.shoes_all_rorfar);
                } else if (random34s == 4) {
                    shoes.setImageResource(R.drawable.shoes_all_sneaker);
                } else if (random34s == 5) {
                    shoes.setImageResource(R.drawable.shoes_aw_boots_short);
                } else if (random34s == 6) {
                    shoes.setImageResource(R.drawable.shoes_ns_boot);
                } else if (random34s == 7) {
                    shoes.setImageResource(R.drawable.shoes_ns_short_boots);
                }
                shoes0++;
            }

            if (socks0 == 0) {
                int random34so = r.nextInt(2);
                if (random34so == 0) {
                    socks.setImageResource(R.drawable.socks_ns_regins);
                } else {

                }

                socks0++;
            }


        }


        if (common.season == 41) {

            if (outer0 == 0) {
                int random41o = r.nextInt(5);
                if (random41o == 0) {
                    outer.setImageResource(R.drawable.outer_nw_kirde);
                } else if (random41o == 1) {
                    outer.setImageResource(R.drawable.outer_ns_trench_);
                } else if (random41o == 2) {
                    outer.setImageResource(R.drawable.outer_ns_riders);
                } else if (random41o == 3) {
                    outer.setImageResource(R.drawable.outer_ns_jumper);
                } else if (random41o == 4) {
                    outer.setImageResource(R.drawable.outer_aw_buruzon);
                } else if (random41o == 5) {
                    outer.setImageResource(R.drawable.outer_aw_dragonnight);
                }
                outer0++;
            }

            int random = r.nextInt(2);
            if (random == 0) {

                if (tops0 == 0) {
                    int random41t = r.nextInt(5);
                    if (random41t == 0) {
                        tops.setImageResource(R.drawable.tops_all_lace_browse);
                    } else if (random41t == 1) {
                        tops.setImageResource(R.drawable.tops_all_longt);
                    } else if (random41t == 2) {
                        tops.setImageResource(R.drawable.tops_all_seven_t);
                    } else if (random41t == 3) {
                        tops.setImageResource(R.drawable.tops_ns_browse_longsr);
                    } else if (random41t == 4) {
                        tops.setImageResource(R.drawable.tops_ss_t_basic);
                    } else if (random41t == 5) {
                        tops.setImageResource(R.drawable.tops_ss_longt);
                    }
                    tops0++;
                }
                if (bottoms0 == 0) {
                    int random41b = r.nextInt(15);
                    if (random41b == 0) {
                        bottoms.setImageResource(R.drawable.bottoms_nw_pant_short);
                    } else if (random41b == 1) {
                        bottoms.setImageResource(R.drawable.bottoms_nw_gaucho_white);
                    } else if (random41b == 2) {
                        bottoms.setImageResource(R.drawable.bottoms_ns_skirt_knit);
                    } else if (random41b == 3) {
                        bottoms.setImageResource(R.drawable.bottoms_ns_leather_skirt);
                    } else if (random41b == 4) {
                        bottoms.setImageResource(R.drawable.bottoms_all_tight_long);
                    } else if (random41b == 5) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_tight);
                    } else if (random41b == 6) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_mini);
                    } else if (random41b == 7) {
                        bottoms.setImageResource(R.drawable.bottoms_all_pencil);
                    } else if (random41b == 8) {
                        bottoms.setImageResource(R.drawable.bottoms_all_loose_pant);
                    } else if (random41b == 9) {
                        bottoms.setImageResource(R.drawable.bottoms_all_lace_skirt);
                    } else if (random41b == 10) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_skirt);
                    } else if (random41b == 11) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_seven);
                    } else if (random41b == 12) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_pant);
                    } else if (random41b == 13) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_damege);
                    } else if (random41b == 14) {
                        bottoms.setImageResource(R.drawable.bottoms_all_fit_pant);
                    }
                    bottoms0++;
                }
            } else if (random == 1) {

                if (onepiece0 == 0) {

                    int random41on = r.nextInt(3);

                    if (random41on == 0) {
                        onepiece.setImageResource(R.drawable.onepiece_all_basic);
                    } else if (random41on == 1) {
                        onepiece.setImageResource(R.drawable.onepiece_all_half);
                    } else if (random41on == 2) {
                        onepiece.setImageResource(R.drawable.onepiece_all_nosreave);
                    }
                }

                onepiece0++;

            }

            if (shoes0 == 0) {
                int random41s = r.nextInt(9);
                if (random41s == 0) {
                    shoes.setImageResource(R.drawable.shoes_all_atuzoko);
                } else if (random41s == 1) {
                    shoes.setImageResource(R.drawable.shoes_all_boot_bohemian);
                } else if (random41s == 2) {
                    shoes.setImageResource(R.drawable.shoes_all_pamps);
                } else if (random41s == 3) {
                    shoes.setImageResource(R.drawable.shoes_all_rorfar);
                } else if (random41s == 4) {
                    shoes.setImageResource(R.drawable.shoes_all_sneaker);
                } else if (random41s == 5) {
                    shoes.setImageResource(R.drawable.shoes_all_surippon);
                } else if (random41s == 6) {
                    shoes.setImageResource(R.drawable.shoes_aw_boots_short);
                } else if (random41s == 7) {
                    shoes.setImageResource(R.drawable.shoes_ns_boot);
                } else if (random41s == 8) {
                    shoes.setImageResource(R.drawable.shoes_ns_short_boots);
                }

                shoes0++;
            }

            if (socks0 == 0) {
                int random41so = r.nextInt(2);
                if (random41so == 0) {
                    socks.setImageResource(R.drawable.socks_ns_regins);
                } else if (random41so == 1) {

                }

                socks0++;
            }


        }


        if (common.season == 42) {

            if (outer0 == 0) {
                int random42o = r.nextInt(4);
                if (random42o == 0) {
                    outer.setImageResource(R.drawable.outer_nw_kirde);
                } else if (random42o == 1) {
                    outer.setImageResource(R.drawable.outer_ns_riders);
                } else if (random42o == 2) {
                    outer.setImageResource(R.drawable.outer_aw_buruzon);
                } else if (random42o == 3) {
                    outer.setImageResource(R.drawable.outer_aw_dragonnight);
                }
                outer0++;
            }

            int random = r.nextInt(2);
            if (random == 0) {

                if (tops0 == 0) {
                    int random42t = r.nextInt(4);
                    if (random42t == 0) {
                        tops.setImageResource(R.drawable.tops_all_lace_browse);
                    } else if (random42t == 1) {
                        tops.setImageResource(R.drawable.tops_all_longt);
                    } else if (random42t == 2) {
                        tops.setImageResource(R.drawable.tops_ns_browse_longsr);
                    } else if (random42t == 3) {
                        tops.setImageResource(R.drawable.tops_ss_longt);
                    }
                    tops0++;
                }
                if (bottoms0 == 0) {
                    int random42b = r.nextInt(12);
                    if (random42b == 0) {
                        bottoms.setImageResource(R.drawable.bottoms_ns_skirt_knit);
                    } else if (random42b == 1) {
                        bottoms.setImageResource(R.drawable.bottoms_ns_leather_skirt);
                    } else if (random42b == 2) {
                        bottoms.setImageResource(R.drawable.bottoms_all_tight_long);
                    } else if (random42b == 3) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_tight);
                    } else if (random42b == 4) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_mini);
                    } else if (random42b == 5) {
                        bottoms.setImageResource(R.drawable.bottoms_all_pencil);
                    } else if (random42b == 6) {
                        bottoms.setImageResource(R.drawable.bottoms_all_loose_pant);
                    } else if (random42b == 7) {
                        bottoms.setImageResource(R.drawable.bottoms_all_lace_skirt);
                    } else if (random42b == 8) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_skirt);
                    } else if (random42b == 9) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_seven);
                    } else if (random42b == 10) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_damege);
                    } else if (random42b == 11) {
                        bottoms.setImageResource(R.drawable.bottoms_all_fit_pant);
                    }
                    bottoms0++;
                }
            } else if (random == 1) {

                if (onepiece0 == 0) {

                    int random42on = r.nextInt(2);

                    if (random42on == 0) {
                        onepiece.setImageResource(R.drawable.onepiece_all_basic);
                    } else if (random42on == 1) {
                        onepiece.setImageResource(R.drawable.onepiece_all_half);
                    }

                    onepiece0++;
                }

            }

            if (shoes0 == 0) {
                int random42s = r.nextInt(9);
                if (random42s == 0) {
                    shoes.setImageResource(R.drawable.shoes_all_atuzoko);
                } else if (random42s == 1) {
                    shoes.setImageResource(R.drawable.shoes_all_boot_bohemian);
                } else if (random42s == 2) {
                    shoes.setImageResource(R.drawable.shoes_all_pamps);
                } else if (random42s == 3) {
                    shoes.setImageResource(R.drawable.shoes_all_rorfar);
                } else if (random42s == 4) {
                    shoes.setImageResource(R.drawable.shoes_all_sneaker);
                } else if (random42s == 5) {
                    shoes.setImageResource(R.drawable.shoes_all_surippon);
                } else if (random42s == 6) {
                    shoes.setImageResource(R.drawable.shoes_aw_boots_short);
                } else if (random42s == 7) {
                    shoes.setImageResource(R.drawable.shoes_ns_boot);
                } else if (random42s == 8) {
                    shoes.setImageResource(R.drawable.shoes_ns_short_boots);
                }

                shoes0++;
            }

            if (socks0 == 0) {
                int random42so = r.nextInt(2);
                if (random42so == 0) {
                    socks.setImageResource(R.drawable.socks_ns_regins);
                } else if (random42so == 1) {

                }
                socks0++;
            }


        }

        if (common.season == 43) {

            if (outer0 == 0) {
                int random43o = r.nextInt(3);
                if (random43o == 0) {
                    outer.setImageResource(R.drawable.outer_aw_buruzon);
                } else if (random43o == 1) {
                    outer.setImageResource(R.drawable.outer_w_down);
                } else if (random43o == 2) {
                    outer.setImageResource(R.drawable.outer_aw_down_neck);
                }
                outer0++;
            }

            int random = r.nextInt(2);
            if (random == 0) {

                if (tops0 == 0) {
                    int random43t = r.nextInt(3);
                    if (random43t == 0) {
                        tops.setImageResource(R.drawable.tops_all_lace_browse);
                    } else if (random43t == 1) {
                        tops.setImageResource(R.drawable.tops_all_longt);
                    } else if (random43t == 2) {
                        tops.setImageResource(R.drawable.tops_ns_browse_longsr);
                    }
                    tops0++;
                }
                if (bottoms0 == 0) {
                    int random43b = r.nextInt(10);
                    if (random43b == 0) {
                        bottoms.setImageResource(R.drawable.bottoms_ns_skirt_knit);
                    } else if (random43b == 1) {
                        bottoms.setImageResource(R.drawable.bottoms_ns_leather_skirt);
                    } else if (random43b == 2) {
                        bottoms.setImageResource(R.drawable.bottoms_all_tight_long);
                    } else if (random43b == 3) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_tight);
                    } else if (random43b == 4) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_mini);
                    } else if (random43b == 5) {
                        bottoms.setImageResource(R.drawable.bottoms_all_pencil);
                    } else if (random43b == 6) {
                        bottoms.setImageResource(R.drawable.bottoms_all_lace_skirt);
                    } else if (random43b == 7) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_skirt);
                    } else if (random43b == 8) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_damege);
                    } else if (random43b == 9) {
                        bottoms.setImageResource(R.drawable.bottoms_all_fit_pant);
                    }
                    bottoms0++;
                }
            } else if (random == 1) {

                if (onepiece0 == 0) {

                    onepiece.setImageResource(R.drawable.onepiece_all_basic);

                    onepiece0++;
                }

            }

            if (shoes0 == 0) {
                int random43s = r.nextInt(8);
                if (random43s == 0) {
                    shoes.setImageResource(R.drawable.shoes_all_boot_bohemian);
                } else if (random43s == 1) {
                    shoes.setImageResource(R.drawable.shoes_all_pamps);
                } else if (random43s == 2) {
                    shoes.setImageResource(R.drawable.shoes_all_rorfar);
                } else if (random43s == 3) {
                    shoes.setImageResource(R.drawable.shoes_all_sneaker);
                } else if (random43s == 4) {
                    shoes.setImageResource(R.drawable.shoes_all_surippon);
                } else if (random43s == 5) {
                    shoes.setImageResource(R.drawable.shoes_aw_boots_short);
                } else if (random43s == 6) {
                    shoes.setImageResource(R.drawable.shoes_ns_boot);
                } else if (random43s == 7) {
                    shoes.setImageResource(R.drawable.shoes_ns_short_boots);
                }

                shoes0++;
            }

            if (socks0 == 0) {
                int random43so = r.nextInt(2);
                if (random43so == 0) {
                    socks.setImageResource(R.drawable.socks_ns_regins);
                } else if (random43so == 1) {

                }

                socks0++;
            }


        }


        if (common.season == 44) {


            if (outer0 == 0) {
                int random44o = r.nextInt(3);
                if (random44o == 0) {
                    outer.setImageResource(R.drawable.outer_aw_down_neck);
                } else if (random44o == 1) {
                    outer.setImageResource(R.drawable.outer_w_down);
                } else if (random44o == 2) {
                    outer.setImageResource(R.drawable.outer_aw_buruzon);
                }
                outer0++;
            }

            int random = r.nextInt(2);
            if (random == 0) {

                if (tops0 == 0) {
                    int random44t = r.nextInt(3);
                    if (random44t == 0) {
                        tops.setImageResource(R.drawable.tops_all_lace_browse);
                    } else if (random44t == 1) {
                        tops.setImageResource(R.drawable.tops_all_longt);
                    } else if (random44t == 2) {
                        tops.setImageResource(R.drawable.tops_ns_browse_longsr);
                    }
                    tops0++;
                }
                if (bottoms0 == 0) {
                    int random44b = r.nextInt(9);
                    if (random44b == 0) {
                        bottoms.setImageResource(R.drawable.bottoms_ns_skirt_knit);
                    } else if (random44b == 1) {
                        bottoms.setImageResource(R.drawable.bottoms_ns_leather_skirt);
                    } else if (random44b == 2) {
                        bottoms.setImageResource(R.drawable.bottoms_all_tight_long);
                    } else if (random44b == 3) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_tight);
                    } else if (random44b == 4) {
                        bottoms.setImageResource(R.drawable.bottoms_all_skirt_mini);
                    } else if (random44b == 5) {
                        bottoms.setImageResource(R.drawable.bottoms_all_pencil);
                    } else if (random44b == 6) {
                        bottoms.setImageResource(R.drawable.bottoms_all_lace_skirt);
                    } else if (random44b == 7) {
                        bottoms.setImageResource(R.drawable.bottoms_all_jeans_damege);
                    } else if (random44b == 8) {
                        bottoms.setImageResource(R.drawable.bottoms_all_fit_pant);
                    }
                    bottoms0++;
                }
            } else if (random == 1) {

                if (onepiece0 == 0) {
                    onepiece.setImageResource(R.drawable.onepiece_all_basic);
                    onepiece0++;
                }

            }

            if (shoes0 == 0) {
                int random44s = r.nextInt(6);
                if (random44s == 0) {
                    shoes.setImageResource(R.drawable.shoes_all_boot_bohemian);
                } else if (random44s == 1) {
                    shoes.setImageResource(R.drawable.shoes_all_rorfar);
                } else if (random44s == 2) {
                    shoes.setImageResource(R.drawable.shoes_all_sneaker);
                } else if (random44s == 3) {
                    shoes.setImageResource(R.drawable.shoes_aw_boots_short);
                } else if (random44s == 4) {
                    shoes.setImageResource(R.drawable.shoes_ns_boot);
                } else if (random44s == 5) {
                    shoes.setImageResource(R.drawable.shoes_ns_short_boots);
                }

                shoes0++;
            }

            if (socks0 == 0) {
                int random44so = r.nextInt(2);
                if (random44so == 0) {
                    socks.setImageResource(R.drawable.socks_ns_regins);
                } else if (random44so == 1) {

                }

                socks0++;
            }


        }

    }

}

